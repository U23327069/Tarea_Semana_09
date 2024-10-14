import java.util.Scanner;
public class Ejercicio04_Semana09 {
        public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        // Definir el arreglo para almacenar los nombres (String[])
        String[] nombres = new String[5];        
        // Ingresar los nombres de las 5 personas
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }        
        // Solicitar el nombre que se desea buscar
        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = lectura.nextLine();
        
        // Variable para verificar si el nombre existe y encontrar la posición
        boolean encontrado = false;
        int posicion = -1;
        
        // Buscar el nombre en el arreglo
        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;  // Guardar la posición donde se encontró el nombre
                break;
            }
        }
        
        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("La persona " + nombreBuscado + " existe en el arreglo en la posición " + (posicion + 1) + ".");
        } else {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}