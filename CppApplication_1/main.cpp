/***********************************************
*
* @Purpose: Create the myDoctor program to assist users in identifying diseases based on symptoms and manage research updates with dynamic memory allocation and pointers.
* @Author: Pablo Ramírez Lázaro
* @Creation date: 19/04/2023
* @Date of last modification: 03/05/2023
*
************************************************/
//Objective: Now change everything so that it is using dynamic memory allocation and pointers instead of arrays.

// ===== System Libraries =====
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ===== LinkedList Library =====
#include "linkedlist.c"

// ===== Constants =====
#define MAX_LENGTH 100
#define MAX_CHAR 50

// ===== Structs =====

typedef struct {
    char disease[MAX_CHAR];
    char symptom[MAX_CHAR];
    int relevance;
} FileDisease;

typedef struct {
    int ignore;
    int update;
    int add;
} ResearchResults;

typedef struct {
    char disease[MAX_CHAR];
    int n_symptoms;
    LinkedList symptoms;
    struct Disease* next;
} Disease;

typedef Symptom Element;

// ===== Function prototypes =====
int readFile(FILE *fp, Disease **diseases, int *num_diseases);
void showDiseases(Disease *diseases, int num_diseases);
void loadResearchAdvances(const char *filename, Disease *diseases, int num_diseases);
void helpMe(LinkedList user_symptoms, int num_symptoms, Disease *diseases, int num_diseases);
int parseInput(const char *user_input, LinkedList *user_symptoms);
int parse_string_to_int(const char *str);
void sortDiseasesByRelevance(int *relevance_sum, Disease *diseases, int num_diseases);

/***********************************************
 * @Purpose:       Loads disease data from a text file into dynamically allocated memory.
 * @Parameters:    in: fp = pointer to the file to be read.
 *                 out: diseases_ptr = pointer to the array of Disease structures to be populated.
 *                 out: num_diseases = pointer to an integer for the count of diseases read.
 * @Return:        int: 0 if successful, 1 if an error occurred (e.g., memory allocation failure).
 ************************************************/

int readFile(FILE* fp, Disease** diseases_ptr, int* num_diseases) {
    Symptom newSymptom; // Allocate memory for a symptom
    int diseaseCount = 0, symptomCount, charCount;
    char buffer[MAX_LENGTH];
    int error = 0;
    int finished = 0; // Flag to track if the loop should be finished

    // Read the number of diseases from the file
    fgets(buffer, sizeof(buffer), fp);
    *num_diseases = parse_string_to_int(buffer);

    // Allocate memory for diseases
    *diseases_ptr = (Disease *)malloc(*num_diseases * sizeof(Disease));
    if (*diseases_ptr == NULL) {
        printf("ERROR: Memory allocation failed\n");
        error = 1;
    }

    if (!error) {
        while (!finished) {
            if (diseaseCount < *num_diseases && fgets(buffer, sizeof(buffer), fp) != NULL) {
                // Read disease name
                buffer[strlen(buffer) - 1] = '\0';
                strcpy((*diseases_ptr)[diseaseCount].disease, buffer);

                // Read number of symptoms
                fgets(buffer, sizeof(buffer), fp);
                (*diseases_ptr)[diseaseCount].n_symptoms = parse_string_to_int(buffer);

                // Create linked list for symptoms
                (*diseases_ptr)[diseaseCount].symptoms = LINKEDLIST_create();
                if (LINKEDLIST_getErrorCode((*diseases_ptr)[diseaseCount].symptoms) == LIST_ERROR_MALLOC) {
                    error = 1;
                    // If an error occurred, free the memory for the diseases and symptoms created before the error
                    for (int i = 0; i <= diseaseCount; ++i) {  // Notice the change here
                        LINKEDLIST_destroy(&(*diseases_ptr)[i].symptoms);
                    }
                    free(*diseases_ptr);
                    *diseases_ptr = NULL; // Set the pointer to NULL
                    *num_diseases = 0;
                    break;  // Break the loop
                }

                // Read all symptoms and relevance
                for (symptomCount = 0; symptomCount < (*diseases_ptr)[diseaseCount].n_symptoms; symptomCount++) {
                    fgets(buffer, sizeof(buffer), fp);
                    buffer[strlen(buffer) - 1] = '\0';

                    // Read symptom name
                    for (charCount = 0; buffer[charCount] != '('; charCount++) {
                        newSymptom.symptom[charCount] = buffer[charCount];
                    }
                    if (newSymptom.symptom[charCount - 1] == ' ') {
                        newSymptom.symptom[charCount - 1] = '\0'; // Remove space before '(' if exists
                    }
                    else {
                        newSymptom.symptom[charCount] = '\0'; // Add null terminator if no space exists
                    }

                    // Parse symptom relevance
                    newSymptom.relevance = parse_string_to_int(buffer + charCount);

                    // Add the symptom to the linked list of symptoms
                    LINKEDLIST_add(&((*diseases_ptr)[diseaseCount].symptoms), newSymptom);
                }
                diseaseCount++;
            }
            else {
                finished = 1;
            }
        }
    }

    if (error) {
        // If an error occurred, free the memory for the diseases
        for (int i = 0; i < *num_diseases; ++i) {
            LINKEDLIST_destroy(&(*diseases_ptr)[i].symptoms);
        }
        free(*diseases_ptr);
        *diseases_ptr = NULL; // Set the pointer to NULL
        *num_diseases = 0;
    }
    return error;
}


/***********************************************
 * @Purpose:       Displays diseases along with their associated symptoms and relevance.
 * @Parameters:    in: diseases = an array of Disease structures that hold disease names and their symptoms.
 *                 in: num_diseases = the count of diseases in the array.
 * @Return:        none
 *********************************************/
void showDiseases(Disease *diseases, int num_diseases) {
    int i; // Counter
    Symptom symptom;

    // Loop through all diseases
    for (i = 0; i < num_diseases; i++) {
        // Print disease name
        printf("%s (", diseases[i].disease);

        // Check if there are symptoms
        if (!LINKEDLIST_isEmpty(diseases[i].symptoms)) {
            // Go to the head of the LinkedList
            LINKEDLIST_goToHead(&diseases[i].symptoms);

            // Loop and print symptoms
            while (!LINKEDLIST_isAtEnd(diseases[i].symptoms)) {
                // Get the symptom and print it
                symptom = LINKEDLIST_get(&diseases[i].symptoms);
                printf("%s#%d", symptom.symptom, symptom.relevance);

                // Move to the next symptom
                LINKEDLIST_next(&diseases[i].symptoms);

                // Print separator if not last symptom
                if (!LINKEDLIST_isAtEnd(diseases[i].symptoms)) {
                    printf(" | ");
                }
            }
        }
        printf(")\n");
    }
}

/***********************************************
 * @Purpose:       Updates disease data by incorporating research advances from a binary file.
 * @Parameters:    in: filename = binary file with research updates.
 *                 in/out: diseases = array of Disease structures to be updated.
 *                 in: num_diseases = number of diseases in the array.
 * @Return:        none
 *********************************************/
void loadResearchAdvances(const char *filename, Disease *diseases, int num_diseases) {
    ResearchResults results = {0, 0, 0};
    FILE *fp;
    FileDisease file_disease;
    int diseaseIndex;
    Symptom symptom;
    int i, symptomFound;
    int error = 0;

    // Open the file
    fp = fopen(filename, "rb");
    if (fp == NULL) {
        printf("ERROR: Research file not found\n");
        error = 1;
    }

    // If there's no error, proceed
    if (!error) {
        // Read each disease from the file
        while (fread(&file_disease, sizeof(FileDisease), 1, fp) == 1) {
            diseaseIndex = -1;

            // Search for the disease in the array of diseases
            for (i = 0; i < num_diseases && diseaseIndex == -1; i++) {
                if (strcmp(diseases[i].disease, file_disease.disease) == 0) {
                    diseaseIndex = i;
                }
            }

            // If the disease was found
            if (diseaseIndex != -1) {
                symptomFound = 0;

                // Check if symptom already exists in the disease
                if (!LINKEDLIST_isEmpty(diseases[diseaseIndex].symptoms)) {
                    LINKEDLIST_goToHead(&diseases[diseaseIndex].symptoms);

                    // Iterate over symptoms
                    while (!LINKEDLIST_isAtEnd(diseases[diseaseIndex].symptoms) && !symptomFound) {
                        symptom = LINKEDLIST_get(&diseases[diseaseIndex].symptoms);

                        // If the symptom is the same as the one in the file
                        if (strcmp(symptom.symptom, file_disease.symptom) == 0) {
                            // Symptom exists, so remove it first
                            LINKEDLIST_remove(&diseases[diseaseIndex].symptoms);
                            diseases[diseaseIndex].n_symptoms--;

                            // Add the new symptom with its relevance
                            symptom.relevance = file_disease.relevance;
                            strcpy(symptom.symptom, file_disease.symptom);
                            LINKEDLIST_add(&diseases[diseaseIndex].symptoms, symptom);
                            diseases[diseaseIndex].n_symptoms++;

                            // Record the update
                            results.update++;
                            symptomFound = 1;
                        }

                        LINKEDLIST_next(&diseases[diseaseIndex].symptoms);
                    }
                }

                // If the symptom was not found or the list was empty, add the new symptom
                if(!symptomFound) {
                    symptom.relevance = file_disease.relevance;
                    strcpy(symptom.symptom, file_disease.symptom);
                    LINKEDLIST_add(&diseases[diseaseIndex].symptoms, symptom);
                    diseases[diseaseIndex].n_symptoms++;
                    results.add++;
                }
            } else {
                // If the disease wasn't found, ignore it
                results.ignore++;
            }
        }

        // Close the file
        fclose(fp);

        // Print the results
        printf("\n%d diseases ignored\n", results.ignore);
        printf("%d symptoms updated\n", results.update);
        printf("%d symptoms added\n", results.add);
    }
}







/***********************************************
 * @Purpose:       Extracts symptoms from user input and stores them in a linked list with dynamically allocated memory.
 * @Parameters:    in: user_input = a string with user-inputted symptoms.
 *                 out: user_symptoms = a pointer to a LinkedList of Symptom structures.
 * @Return:        The number of symptoms successfully extracted and stored.
 ***********************************************/
int parseInput(const char *user_input, LinkedList *user_symptoms) {
    Symptom new_symptom;
    int i = 0, symptomStart = 0, symptomLength = 0;
    int length = strlen(user_input);
    char symptom[MAX_CHAR];
    int symptomCount = 0; // to keep track of the number of symptoms parsed

    // Initialize the LinkedList
    *user_symptoms = LINKEDLIST_create();

    // Parse user input
    while (i <= length) {
        if (user_input[i] == '+' || user_input[i] == '\0') {
            strncpy(symptom, user_input + symptomStart, symptomLength);
            symptom[symptomLength] = '\0';


            strncpy(new_symptom.symptom, symptom, symptomLength+1); // Copy the symptom name
            new_symptom.relevance = 0; // Set relevance to 0 as default

            LINKEDLIST_add(user_symptoms, new_symptom); // Add symptom to LinkedList

            symptomStart = i + 1;
            symptomLength = 0;
            symptomCount++; // increment the symptom count
        }
        else {
            symptomLength++;
        }
        i++;
    }

    return symptomCount;
}



/***********************************************
 * @Purpose:       Converts a string containing only numeric characters into its corresponding integer value.
 * @Parameters:    in: str = string representing the integer value.
 * @Return:        The converted integer value of the input string.
 ***********************************************/
int parse_string_to_int(const char *str) {
    int value = 0;
    int i;
    for (i = 0; str[i] != '\0'; ++i) {
        if (str[i] >= '0' && str[i] <= '9') {
            value = value * 10 + (str[i] - '0');
        }
    }
    return value;
}


/***********************************************
 * @Purpose:       Applies Selection Sort algorithm to sort diseases by their relevance.
 * @Parameters:    in/out: relevance_sum = array with the sum of relevance for each disease.
 *                 in/out: diseases = array of Disease structures to be sorted.
 *                 in: num_diseases = the number of diseases in the array.
 * @Return:        none
 ***********************************************/
void sortDiseasesByRelevance(int *relevance_sum, Disease *diseases, int num_diseases) {
    LinkedList temp_symptoms;
    int tempRelevance;
    int i, j;
    // Outer loop that iterates over each element of the disease array
    for (i = 0; i < num_diseases - 1; i++) {
        // Inner loop to find the disease with maximum relevance from the remaining diseases
        for (j = i + 1; j < num_diseases; j++) {
            // If current disease has higher relevance, swap it with the disease in the outer loop
            if (relevance_sum[j] > relevance_sum[i]) {
                // Swap relevance sums
                tempRelevance = relevance_sum[i];
                relevance_sum[i] = relevance_sum[j];
                relevance_sum[j] = tempRelevance;

                // Swap disease names
                char temp_disease_name[MAX_LENGTH];
                strcpy(temp_disease_name, diseases[i].disease);
                strcpy(diseases[i].disease, diseases[j].disease);
                strcpy(diseases[j].disease, temp_disease_name);

                // Swap symptom lists
                temp_symptoms = diseases[i].symptoms;
                diseases[i].symptoms = diseases[j].symptoms;
                diseases[j].symptoms = temp_symptoms;
            }
        }
    }
}



/***********************************************
 * @Purpose:       Identifies and ranks potential diseases based on the symptoms provided by the user.
 * @Parameters:    in: user_symptoms = LinkedList of user-provided symptoms.
 *                 in: num_symptoms = number of user-provided symptoms.
 *                 in/out: diseases = array of Disease structures to be assessed and sorted.
 *                 in: num_diseases = number of diseases in the array.
 * @Return:        none
 ***********************************************/
void helpMe(LinkedList user_symptoms, int num_symptoms, Disease *diseases, int num_diseases) {
    Node* current_symptom_node;
    Symptom current_user_symptom, current_disease_symptom;
    Disease tmp_disease;
    int i, j, tmp_relevance;
    int relevance_sum[MAX_LENGTH] = {0};  // Holds the summed relevance for each disease

    // Loop over each symptom the user provided
    current_symptom_node = user_symptoms.head;
    while (current_symptom_node != NULL) {
        current_user_symptom = current_symptom_node->element;
        // Check each disease for the current symptom
        for (i = 0; i < num_diseases && diseases[i].disease[0] != '\0'; i++) {
            // Start at the beginning of the disease's symptom list
            LINKEDLIST_goToHead(&diseases[i].symptoms);
            // Check each symptom of the disease
            while (!LINKEDLIST_isAtEnd(diseases[i].symptoms)) {
                current_disease_symptom = LINKEDLIST_get(&diseases[i].symptoms);
                // If the disease's symptom matches the user's symptom, add its relevance
                if (strcmp(current_disease_symptom.symptom, current_user_symptom.symptom) == 0) {
                    relevance_sum[i] += current_disease_symptom.relevance;
                }
                // Proceed to the next symptom of the disease
                LINKEDLIST_next(&diseases[i].symptoms);
            }
        }
        // Proceed to the next user symptom
        current_symptom_node = current_symptom_node->next;
    }

    // Sort diseases by their summed relevance
    for (i = 0; i < num_diseases - 1; i++) {
        for (j = i + 1; j < num_diseases; j++) {
            // If a disease has a higher summed relevance, swap it forward
            if (relevance_sum[j] > relevance_sum[i]) {
                tmp_relevance = relevance_sum[i];
                relevance_sum[i] = relevance_sum[j];
                relevance_sum[j] = tmp_relevance;

                tmp_disease = diseases[i];
                diseases[i] = diseases[j];
                diseases[j] = tmp_disease;
            }
        }
    }

    // If any disease has non-zero summed relevance, print them
    if (relevance_sum[0] > 0) {
        printf("\nMost probable diseases:\n");
        for (i = 0; i < num_diseases && diseases[i].disease[0] != '\0'; i++) {
            if (relevance_sum[i] > 0) {
                printf("Total relevance %d: %s\n", relevance_sum[i], diseases[i].disease);
            }
        }
    } else {
        // If no disease has non-zero summed relevance, inform the user
        printf("\nNo diseases found!\n");
    }
    //LINKEDLIST_destroy(&user_symptoms);
}



int main() {
    // ===== Variable Declarations =====
    char filename[MAX_LENGTH];
    FILE *fp = NULL;
    Disease *diseases = NULL;
    char option_str[MAX_LENGTH];
    char user_input[MAX_LENGTH];
    int num_diseases = 0;
    int num_user_symptoms;
    int valid_input;
    int i;
    int error = 0;
    LinkedList user_symptoms = LINKEDLIST_create();

    printf("Enter diseases file name: ");
    fgets(filename, sizeof(filename), stdin);
    filename[strcspn(filename, "\n")] = 0;

    fp = fopen(filename, "r");
    if (fp == NULL) {
        printf("\nERROR: Diseases file not found\n");
        error = 1;
    }
    else {
        error = readFile(fp, &diseases, &num_diseases);
        if (error != 0) {
            printf("\nERROR: Could not allocate memory for diseases or could not read the file properly\n");
            error = 1;
        }
        fclose(fp);
        printf("Welcome to myDoctor!\n");

        while (strcmp(option_str, "4") != 0 && !error) {
            valid_input = 0;
            printf("\n1. Show diseases | 2. Load research advances | 3. Help me! | 4. Quit\n\n");
            printf("Enter option: ");

            fgets(option_str, sizeof(option_str), stdin);
            option_str[strcspn(option_str, "\n")] = 0;

            if (strcmp(option_str, "1") == 0) {
                printf("\nRegistered diseases:\n\n");
                showDiseases(diseases, num_diseases);
                valid_input = 1;
            }
            else if (strcmp(option_str, "2") == 0) {
                printf("Enter research file name: ");
                fgets(filename, sizeof(filename), stdin);
                filename[strcspn(filename, "\n")] = 0;
                loadResearchAdvances(filename, diseases, num_diseases);
                valid_input = 1;
            }
            else if (strcmp(option_str, "3") == 0) {
                printf("Enter your symptoms: ");
                fgets(user_input, sizeof(user_input), stdin);
                user_input[strcspn(user_input, "\n")] = 0;
                num_user_symptoms = parseInput(user_input, &user_symptoms);
                helpMe(user_symptoms, num_user_symptoms, diseases, num_diseases);
                valid_input = 1;
                // Destroy the list of user symptoms here
                LINKEDLIST_destroy(&user_symptoms);
                // Reinitialize the list of user symptoms
                user_symptoms = LINKEDLIST_create();
            }
            else if (strcmp(option_str, "4") == 0) {
                valid_input = 1;
            }

            if (!valid_input) {
                printf("\nERROR: Wrong option\n");
            }
        }

        printf("\nStay healthy!");
    }

    // Check if user_symptoms has been initialized before trying to destroy it
    if (user_symptoms.head != NULL) {
        LINKEDLIST_destroy(&user_symptoms);
    }
    free(user_symptoms);

    // Check if diseases pointer has been allocated memory before trying to free it
    if (diseases != NULL) {
        // Free the memory allocated to diseases and its symptoms
        for (i = 0; i < num_diseases; ++i) {
            if (diseases[i].symptoms.head != NULL) {
                LINKEDLIST_destroy(&diseases[i].symptoms);
            }
        }
        free(diseases);
    }

    return 0;
}