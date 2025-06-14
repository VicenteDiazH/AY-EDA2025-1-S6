
// Problema 2: Análisis de Estabilidad

public class Problema2 {

    // Selection Sort NO es estable
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 4, 2};
        selectionSort(arr);

        System.out.print("Resultado: ");
        for (int num : arr) System.out.print(num + " ");
    }
}

/*
1) ¿Qué algoritmo es?
Es el algoritmo Selection Sort (ordenamiento por selección).

2) ¿Es estable? ¿Por qué?
No es estable. Porque cuando encuentra el elemento mínimo, lo intercambia con la posición actual, incluso 
si hay elementos iguales antes. Ese swap puede cambiar el orden relativo de elementos con el mismo valor.

3) ¿Cómo lo harías estable?
En vez de hacer un swap directo, se puede:
    - Guardar el mínimo.
    - Mover todos los elementos entre i y min una posición a la derecha.
    - Insertar el mínimo en la posición i.
*/