import java.util.Scanner;
public class Ejercicio05_Semana09 {
        public static void main(String[] args) {
        // Declarar los arreglos a y b (short[])
        short[] a = new short[5];
        short[] b = new short[5];
        short[] c = new short[10];      
        Scanner lectura=new Scanner(System.in);        
        //Ingresar los valores en el arreglo a
        System.out.println("Ingrese los valores del arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = lectura.nextShort();
        }        
        //Ingresar los valores en el arreglo b
        System.out.println("\nIngrese los valores del arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = lectura.nextShort();
        }        
        //Intercalar los valores de a y b en el arreglo c
        int indexC = 0;
        for (int i = 0; i < 5; i++) {
            c[indexC] = a[i];  // Copiar el valor de a[i] en c
            indexC++;
            c[indexC] = b[i];  // Copiar el valor de b[i] en c
            indexC++;
        }        
        //Mostrar los valores del arreglo c intercalado
        System.out.println("\nValores del arreglo c intercalados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}