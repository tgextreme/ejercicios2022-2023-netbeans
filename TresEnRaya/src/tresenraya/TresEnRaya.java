/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TresEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void imprimirTabla(int[][] tabla){
        for(int i=0;i<3;i++){
            for(int o=0;o<3;o++){
                System.out.println(tabla[i][o]+"|");
            }
        }
    }    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca =new Scanner(System.in);
        int[][] tres=new int [3][3];
        int i=0;
        boolean ganado=false;
        int actual=1;
        int o=1, columna,fila ;
        imprimirTabla(tres);
        while(ganado==false){
            System.out.println("Dime una columna jugador 1");
            columna=sca.nextInt();
            System.out.println("Dime una fila jugador 1");
            fila=sca.nextInt();
            tres[columna][fila]=1;
            imprimirTabla(tres);
            System.out.println("Dime una columna jugador 2");
            columna=sca.nextInt();
            System.out.println("Dime una fila jugador 2");
            fila=sca.nextInt();
            tres[columna][fila]=2;
            imprimirTabla(tres);
            
        }
        
        
        
    }
    
}
