import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                System.out.println("Índice: " + mid);
                System.out.println("Pasos: " + steps);
                return mid;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Número no encontrado");
        System.out.println("Pasos: " + steps);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingrese " + n + " números ordenados:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int target = sc.nextInt();

        binarySearch(arreglo, target);
    }
}
