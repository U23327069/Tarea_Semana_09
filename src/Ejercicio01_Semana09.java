import java.util.Scanner;
public class Ejercicio01_Semana09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();        
        // Definir el arreglo para almacenar los pesos (short[])
        short[] pesos = new short[n];        
        // Variable para calcular la suma de los pesos
        int sumaPesos = 0;        
        // Ingresar los pesos de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + " en kg (sin decimales): ");
            pesos[i] = scanner.nextShort();            
            // Sumar el peso actual al total
            sumaPesos += pesos[i];
        }        
        // Calcular el promedio de pesos
        double promedioPesos = (double) sumaPesos / n;        
        // Mostrar el resultado
        System.out.println("El peso promedio de las personas es: " + promedioPesos + " kg");
    }
}