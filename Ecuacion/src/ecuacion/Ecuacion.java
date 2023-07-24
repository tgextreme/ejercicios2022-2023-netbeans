package ecuacion;

public class Ecuacion {

    public static void main(String[] args) {

        double a = 2;
        double b = - 8;
        double c = -18;

        double x1;
        double x2;
        double operacion = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
         if (Double.isNaN(operacion)) {
            System.out.println("No tiene solución");

        } else {
            x1 = (-b + operacion) / (2 * a);
            x2 = (-b - operacion) / (2 * a);
            System.out.println("El valor de la ecucacion es " + x1);
            System.out.println("El valor de la ecucacion es " + x2);
        }
    }
    static int devolverMayor(int num1, int num2 ){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
}
