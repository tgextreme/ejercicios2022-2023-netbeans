/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IbanJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author usuario
 */
public class Funciones {

    public Boolean isCheckPatIban(String cuenta) {
        
        Pattern patNum = Pattern.compile("[0-9]{20}");// Creo el patrón
        Matcher matNum = patNum.matcher(cuenta);//Paso la variable, en este caso correo
        if (matNum.matches()) {
            String banco = cuenta.substring(0, 4);
            String sucursal = cuenta.substring(4, 8);
            String dC = cuenta.substring(8, 10);
            String CCC = cuenta.substring(10, 20);
            if (!(obtenerDigito("00" + banco + sucursal) == Integer.parseInt(String.valueOf(dC.charAt(0))))
                    || !(obtenerDigito(CCC) == Integer.parseInt(String.valueOf(dC.charAt(1))))) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int obtenerDigito(String valor) {
        Integer[] valores = new Integer[]{1, 2, 4, 8, 5, 10, 9, 7, 3, 6};

        Integer control = 0;
        for (int i = 0; i <= 9; i++) {
            control += Integer.parseInt(String.valueOf(valor.charAt(i))) * valores[i];
        }
        control = 11 - (control % 11);
        if (control == 11) {
            control = 0;
        } else if (control == 10) {
            control = 1;
        }
        return control;
    }

}
