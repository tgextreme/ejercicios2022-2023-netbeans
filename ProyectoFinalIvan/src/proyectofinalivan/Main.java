/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalivan;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Usuario user[] = new Usuario[2];
    static int usuNum = 0;
    static int numPreguntas = 0;

    static char[] resp = new char[6];

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 5;

        do {

            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    crearPerfil();
                    break;
                case 2:
                    calculoIMC();
                    break;
                case 3:
                    responderPreguntas();
                    break;
                case 4:
                    cuantasComidasHaces();
                    break;

            }

        } while (opcion != 5);

    }

    static void cuantasComidasHaces() {
        Scanner sc = new Scanner(System.in);
        String dni, dniR;
        boolean existe = false;
        System.out.println("Digame DNI");
        dni = sc.nextLine();
        int numUsuEx = -1;
        for (int i = 0; i < usuNum; i++) {
            if (user[i].getDni().equals(dni)) {
                existe = true;
                numUsuEx = i;
            }
        }
        if (existe) {
            int comidas;
            int comidaChatarra;
            int porcionesFruta = 0, porcionesVerdura = 0, intermedio;
            //Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuantas comidas haces?");
            comidas = sc.nextInt();

            for (int i = 0; i < comidas; i++) {
                System.out.println("¿Cuantas frutas comes en comida " + (i + 1) + "?");
                intermedio = sc.nextInt();
                porcionesFruta += intermedio;
                System.out.println("¿Cuantas verduras comes en la comida " + (i + 1));
                intermedio = sc.nextInt();
                porcionesVerdura += intermedio;

            }

            System.out.println("¿Cuántas veces a la semana comes McDonals, Kebab o Burger King?:");
            comidaChatarra = sc.nextInt();
            porcionesFruta = porcionesFruta * 7;
            porcionesVerdura = porcionesVerdura * 7;
            double total = Double.parseDouble(comidaChatarra + "") + Double.parseDouble(porcionesFruta + "") + Double.parseDouble(porcionesVerdura + "");
            total = (comidaChatarra * 100) / total;

            if (porcionesFruta < 5) {
                System.out.println("Debes de comer al menos 5 piezas de fruta al día");
            } else {
                System.out.println("Tienes un buen habito comiendo futa");
            }
            if (porcionesVerdura < 3) {
                System.out.println("Debes comer al menos 3 veces verdura");
            } else {
                System.out.println("Tienes un buen hábito comiendo verduras");
            }
            System.out.println("Tu porcentaje de comida rápida semanal ingerida es " + total);
            if (total > 19) {
                System.out.println("Deberías comer menos comida rápida para prefenir futuros problemas de salud");
            } else {
                System.out.println("Tienes un buen hábito de no comer comida chatarra");
            }
            if (total == 0) {
                System.out.println("El no comer comida rápida va a beneficiar tu salud a largo plazo.");
            } else if (total < 10) {
                System.out.println("Tu porcentaje de comida rápida semanal ingerida es " + total + "%. Está dentro del límite recomendado\n"
                        + "siempre que hagas deporte y descanses lo suficiente.");
            } else if (total < 40) {
                System.out.println("Tu porcentaje de comida rápida semanal ingerida es " + total + "%. Está dentro del límite recomendado\n"
                        + "Deberías comer menos comida rápida para prevenir posibles problemas de salud.");
            } else if (total >= 40) {
                System.out.println("Tu porcentaje de comida rápida semanal ingerida es " + total + "%. Debes cambiar tus hábitos, tu salud está en riesgo por tu alta ingesta de comida rápida");

            }
        }
    }

    static void responderPreguntas() {
        Scanner sc = new Scanner(System.in);
        String dni, dniR;
        boolean existe = false;
        System.out.println("Digame DNI");
        dni = sc.nextLine();
        int numUsuEx = -1;
        for (int i = 0; i < usuNum; i++) {
            if (user[i].getDni().equals(dni)) {
                existe = true;
                numUsuEx = i;
            }
        }
        if (existe) {
            boolean respuesta = false;
            char intermedio = '2';
            Respuestas resultado = new Respuestas();
            //Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 6; i++) {

                if (i == 0) {
                    System.out.println("¿Fumas a menudo?");
                    System.out.println("a) Si ");
                    System.out.println("b) Algunos días  ");
                    System.out.println("c) No");
                    intermedio = sc.next().charAt(0);
                    resultado.setA1(intermedio);

                } else if (i == 1) {
                    System.out.println("¿Cuánto alcohol bebes?");
                    System.out.println("a) Todos los días ");
                    System.out.println("b)  Sobretodo los fines de semana  ");
                    System.out.println("c) Muy poco");
                    intermedio = sc.next().charAt(0);
                    resultado.setA2(intermedio);
                } else if (i == 2) {
                    System.out.println("¿Cuántas horas duermes al día? ");
                    System.out.println("a) Menos de 4 horas  ");
                    System.out.println("b) Entre 5 y 6 horas  ");
                    System.out.println("c) Más de 6 horas.");
                    intermedio = sc.next().charAt(0);
                    resultado.setA3(intermedio);
                } else if (i == 3) {
                    System.out.println("¿Sueles estresarte y notar cansancio a lo largo del día?    ");
                    System.out.println("a) Es mi día a día  ");
                    System.out.println("b)  A veces   ");
                    System.out.println("c) Muy poco  ");
                    intermedio = sc.next().charAt(0);
                    resultado.setA4(intermedio);
                } else if (i == 4) {
                    System.out.println("¿Cuál es tu forma física?  ");
                    System.out.println("a) Estoy muy desentrenado tanto en fuerza como en resistencia  ");
                    System.out.println("b) Forma física normal   ");
                    System.out.println("c) Muy buena forma física  ");
                    intermedio = sc.next().charAt(0);
                    resultado.setA5(intermedio);
                } else if (i == 5) {
                    System.out.println("¿Cuántas veces practicas deporte a la semana? ");
                    System.out.println("a) Entre 1 y 2 veces  ");
                    System.out.println("b) Entre 3 y 4 veces  ");
                    System.out.println("c) Todos los días");
                    intermedio = sc.next().charAt(0);
                    resultado.setA6(intermedio);
                }

                if (intermedio != 'a' && intermedio != 'b' && intermedio != 'c') {
                    System.out.println("Debes poner una opción válida");
                    i--;
                }

            }
            user[numUsuEx].setRespuestas(resultado);

        } else {
            System.out.println("El usuario no existe");
        }

    }

    static void mostrarMenu() {
        System.out.println("1- Crear perfil ");
        System.out.println("2- Calculo del IMC");
        System.out.println("3- Seguir hábitos saludables.");
        System.out.println("4- Conocer si llevas una alimentación variada y rica para una buena salud.  ");
        System.out.println("5- Salir del programa");

    }

    static void calculoIMC() {
        Scanner sc = new Scanner(System.in);
        String dni, dniR;
        boolean existe = false;
        System.out.println("Digame DNI");
        dni = sc.nextLine();
        int numUsuEx = -1;
        for (int i = 0; i < usuNum; i++) {
            if (user[i].getDni().equals(dni)) {
                existe = true;
                numUsuEx = i;
            }
        }
        if (existe) {//falta poner que si ya ha entrado el usuario
            if (user[numUsuEx].getImc() < 5.0) {
                double peso, altura;
                System.out.println("Digame peso");
                peso = sc.nextDouble();
                System.out.println("Digame altura");
                altura = sc.nextDouble();
                user[numUsuEx].setImc(peso / altura);
                System.out.println("Su IMC es " + user[numUsuEx].getImc());
            } else {
                System.out.println("Ya le digimos que su IMC es " + user[numUsuEx].getImc());
            }

        } else {
            System.out.println("El usuario con dni " + dni + " no existe");
        }

    }

    static void crearPerfil() {
        if (usuNum < 2) {
            String nombre;
            String dni;
            boolean dniCorrecto = false;
            int edad;
            char sexo;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Dime nombre");
                nombre = sc.nextLine();
            } while (nombre.length() < 4);
            do {
                System.out.println("Dime DNI");
                dni = sc.nextLine();
                dniCorrecto = checkDni(dni);
            } while (dniCorrecto == false);
            do {
                System.out.println("Dime edad");
                edad = sc.nextInt();
            } while (edad < 5 || edad > 120);
            //System.out.println("Dime sexo");
            //sexo = (char) sc.next().charAt(0);
            do {
                System.out.println("Dime sexo");
                sexo = (char) sc.next().charAt(0);
            } while (sexo != 'M' && sexo != 'H');
            if (!existeDni(dni)) {
                user[usuNum] = new Usuario(nombre, dni, edad, sexo);
                usuNum++;
            } else {
                System.out.println("Existe un usuario con ese dni");
            }
        } else {
            System.out.println("No se puede crear más usuarios");
        }

    }

    static boolean checkDni(String dni) {
        try {

            if (dni.length() != 9) {
                return false;
            }
            int numero = Integer.parseInt(dni.substring(0, 8)) % 23;
            System.out.println(dni.substring(8, 9) + "");
            char letra = dni.substring(8, 9).charAt(0);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            if (letra == letras.charAt(numero)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean existeDni(String dni) {
        for (int i = 0; i < usuNum; i++) {
            if (dni.equals(user[i].getDni())) {
                return true;
            }
        }
        return false;
    }
}
