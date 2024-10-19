import java.util.Scanner;
public class Ejercicio03_Semana09 {
        public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);        
        //Declaramos las variables
        System.out.print("Ingrese el numero de personas: ");
        int n = lectura.nextInt();        
        short[] compras = new short[n];        
        int totalCompras = 0;
        short compraMayor = Short.MIN_VALUE;
        short compraMenor = Short.MAX_VALUE;        
        //Ingresamos las compras
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextShort();
            totalCompras += compras[i];
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }            
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }        
        double promedioCompras = (double) totalCompras / n;        
        //Mostrar el total, promedio, mayor y menor compra
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La mayor compra es: " + compraMayor);
        System.out.println("La menor compra es: " + compraMenor);
    }
}