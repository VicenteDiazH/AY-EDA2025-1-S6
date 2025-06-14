
// Problema 1: Estabilidad en práctica

class Estudiante {
    String nombre;
    double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return nombre + " (" + nota + ")";
    }
}

public class Problema1 {
    public static void bubbleSort(Estudiante[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].nota > arr[j + 1].nota) {
                    Estudiante temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(Estudiante[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Estudiante key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].nota > key.nota) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(Estudiante[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].nota < arr[minIdx].nota) {
                    minIdx = j;
                }
            }
            Estudiante temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void imprimir(Estudiante[] arr) {
        for (Estudiante e : arr) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Benjamin", 7.0),
            new Estudiante("Catalina", 6.0),
            new Estudiante("Liliana", 7.0),
            new Estudiante("Diego", 5.5)
        };

        System.out.println("Original:");
        imprimir(estudiantes);

        Estudiante[] copia1 = estudiantes.clone();
        Estudiante[] copia2 = estudiantes.clone();
        Estudiante[] copia3 = estudiantes.clone();

        System.out.println("Bubble Sort:");
        bubbleSort(copia1);
        imprimir(copia1);

        System.out.println("Insertion Sort:");
        insertionSort(copia2);
        imprimir(copia2);

        System.out.println("Selection Sort:");
        selectionSort(copia3);
        imprimir(copia3);
    }
}
