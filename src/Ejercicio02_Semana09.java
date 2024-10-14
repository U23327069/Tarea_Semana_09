import java.util.Scanner;
public class Ejercicio02_Semana09 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);        
        // Solicitar el número de personas
        System.out.print("Ingrese el numero de personas: ");
        int n = lectura.nextInt();        
        // Definir el arreglo para almacenar los ingresos (short[])
        short[] ingresos = new short[n];        
        // Variables para calcular el total de ingresos y encontrar el mayor ingreso
        int sumaIngresos = 0;
        short ingresoMayor = Short.MIN_VALUE;  // Inicializado al valor más bajo posible de short        
        // Ingresar los ingresos de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextShort();            
            // Sumar el ingreso actual al total
            sumaIngresos += ingresos[i];            
            // Verificar si es el mayor ingreso
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }        
        // Calcular el promedio de ingresos
        double promedioIngresos = (double) sumaIngresos / n;        
        // Mostrar el ingreso promedio y el mayor ingreso
        System.out.println("El ingreso promedio es: " + promedioIngresos);
        System.out.println("El mayor ingreso es: " + ingresoMayor);
    }
}
