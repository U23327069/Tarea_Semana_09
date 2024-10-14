import java.util.Scanner;
public class Ejercicio01_Semana09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        //Solicitar el número de personas
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();        
        //Definir el arreglo para almacenar los pesos (short[])
        short[] pesos = new short[n];        
        int sumaPesos = 0;        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + " en kg (sin decimales): ");
            pesos[i] = scanner.nextShort();            
            sumaPesos += pesos[i];
        }        
        //Calcular el promedio de pesos
        double promedioPesos = (double) sumaPesos / n;        
        //Mostramos los resultados
        System.out.println("El peso promedio de las personas es: " + promedioPesos + " kg");
    }
}