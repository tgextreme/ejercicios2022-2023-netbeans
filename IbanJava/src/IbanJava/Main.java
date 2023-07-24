/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IbanJava;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        String cuatro="1234";
        int sumaA=Integer.parseInt(cuatro.charAt(0)+"")*4+Integer.parseInt(cuatro.charAt(1)+"")*8+Integer.parseInt(cuatro.charAt(2)+"")*5+Integer.parseInt(cuatro.charAt(3)+"")*10;
        String siguientesCuatro="5678";
        int sumaB=Integer.parseInt(siguientesCuatro.charAt(0)+"")*9+Integer.parseInt(siguientesCuatro.charAt(1)+"")*7+Integer.parseInt(siguientesCuatro.charAt(2)+"")*3+Integer.parseInt(siguientesCuatro.charAt(3)+"")*6;
        System.out.println(sumaA);
        System.out.println(sumaB);
        int restoC=(sumaA+sumaB)%11;
        int digControl=11-restoC;
        if(digControl==10){
            digControl=1;
        }
        if(digControl==11){
            digControl=0;
        }
        System.out.println(restoC);
        
    }
}
