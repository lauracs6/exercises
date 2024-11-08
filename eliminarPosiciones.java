import java.util.Arrays;
import java.util.Scanner;
public class eliminarElementos {
    public static void main (String[] args) {

        int numerosFavoritos[] = {6, 8, 9, 1, 3, 5};
        int totalPosiciones = numerosFavoritos.length;
        System.out.println(Arrays.toString(numerosFavoritos));

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la posición que deseas eliminar");
        int posicion = teclado.nextInt();

        while (posicion >= 0 && totalPosiciones != 0) {
            if (posicion < totalPosiciones) {
            numerosFavoritos[posicion] = numerosFavoritos[totalPosiciones - 1];
            totalPosiciones --;
            mostrarTabla (numerosFavoritos, totalPosiciones);
            }
            else {
                System.out.println("No existe la posición.");
            }
        System.out.println("Posición a borrar: ");
        posicion = teclado.nextInt();
        }
        System.out.println("No quedan posiciones.");
        
        boolean negativo = true;
        if (posicion < 0) {
            System.out.println("Introduce la posición que deseas eliminar: ");
            negativo = false;
        }

    }

    public static void mostrarTabla (int a[], int posicion) {
        System.out.println("[");

        for (int i = 0; i < posicion; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("]");
    }
    
}
