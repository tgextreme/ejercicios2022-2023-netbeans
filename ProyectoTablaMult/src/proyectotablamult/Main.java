/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotablamult;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String nombreArchivo = "tabla.txt";
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                archivo.createNewFile(); // creamos el archivo si no existe

            }else{
                archivo.delete();
                archivo.createNewFile();
            }
            FileWriter fichero = new FileWriter(nombreArchivo,true);
            
            
        for(int i=2;i<50;i++){
            for(int j=2;j<50;j++){
                fichero.append(i+" por "+j+" = "+(i*j)+"\r\n");
            }
        }
        fichero.flush();
            fichero.close();
        }catch (Exception ex){
            
        }
    }
    
}
