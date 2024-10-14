import java.util.Scanner;
public class Ejercicio02_Semana09 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);        
        //Solicitar el número de personas
        System.out.print("Ingrese el numero de personas: ");
        int n = lectura.nextInt();        
        short[] ingresos = new short[n];        
        //Variables para calcular el total
        int sumaIngresos = 0;
        short ingresoMayor = Short.MIN_VALUE;      
        //Ingresar los ingresos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextShort();            
            // Sumar el ingreso actual al total
            sumaIngresos += ingresos[i];           
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }     
        double promedioIngresos = (double) sumaIngresos / n;        
        //Muestra de datos
        System.out.println("El ingreso promedio es: " + promedioIngresos);
        System.out.println("El mayor ingreso es: " + ingresoMayor);
    }
}
