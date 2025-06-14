import java.util.Scanner;

public class BinarySearchStepByStep {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int steps = 0;

        System.out.println("\n--- Comenzando búsqueda binaria ---");

        while (low <= high) {
            steps++;

            // Para fines pedagógicos, mostramos cómo se calcula "mid" con decimales
            float midDecimal = (low + high) / 2.0f;
            int mid = low + (high - low) / 2;

            System.out.println("\nPaso " + steps + ":");
            System.out.println("low = " + low + ", high = " + high);
            System.out.printf("Cálculo decimal de mid = (%.1f + %.1f) / 2 = %.1f%n", (float)low, (float)high, midDecimal);
            System.out.println("Al convertir a entero (int), se aproxima hacia abajo => mid = " + mid);
            System.out.println("Valor en mid = " + array[mid]);

            if (array[mid] == target) {
                System.out.println(">> El número " + target + " fue encontrado en el índice " + mid + ".");
                System.out.println("Total de pasos: " + steps);
                return mid;
            }

            if (array[mid] < target) {
                System.out.println(">> " + array[mid] + " es menor que " + target + ", se descarta la mitad izquierda.");
                low = mid + 1;
            } else {
                System.out.println(">> " + array[mid] + " es mayor que " + target + ", se descarta la mitad derecha.");
                high = mid - 1;
            }
        }

        System.out.println("\n>> El número " + target + " no se encuentra en el arreglo.");
        System.out.println("Total de pasos: " + steps);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingrese " + n + " números ordenados (de menor a mayor):");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int target = sc.nextInt();

        binarySearch(arreglo, target);
    }
}
