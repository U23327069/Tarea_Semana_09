import java.util.Scanner;
public class Ejercicio05_Semana09 {
        public static void main(String[] args) {
        // Declaramos las variables
        short[] a = new short[5];
        short[] b = new short[5];
        short[] c = new short[10];      
        Scanner lectura=new Scanner(System.in);        
        //Agregamos las variables
        System.out.println("Ingrese los valores del arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = lectura.nextShort();
        }
        System.out.println("\nIngrese los valores del arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = lectura.nextShort();
        }
        int indexC = 0;
        for (int i = 0; i < 5; i++) {
            c[indexC] = a[i];
            indexC++;
            c[indexC] = b[i];
            indexC++;
        }        
        //Mostrar los resultados del programa
        System.out.println("\nValores del arreglo c intercalados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
            //Fin del programa
        }
    }
}