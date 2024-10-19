import java.util.Scanner;
public class Ejercicio04_Semana09 {
        public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String[] nombres = new String[5];        
        //Ingresaremos los 5 nombres
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }        
        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = lectura.nextLine();        
        //Agregamos la variable para verificar si el nombre existe
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        //Salida de datos
        if (encontrado) {
            System.out.println("La persona " + nombreBuscado + " existe " + (posicion + 1) + ".");
        } else {
            System.out.println("La persona " + nombreBuscado + " no existe.");
            //Fin del programa
        }
    }
}