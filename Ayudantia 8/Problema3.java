
// Problema 3: Selection Sort Estable

public class Problema3 {

    public static void stableSelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int key = arr[min];
            while (min > i) {
                arr[min] = arr[min - 1];
                min--;
            }
            arr[i] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 4, 1};
        stableSelectionSort(arr);

        System.out.print("Resultado estable: ");
        for (int num : arr) System.out.print(num + " ");
    }
}

/* 
1) ¿Qué implica que un algoritmo de ordenamiento sea estable?
Que mantiene el orden relativo de los elementos con claves iguales. Si dos elementos son iguales, el que 
estaba antes sigue estando antes después del ordenamiento.

2) ¿Cuándo importa que sea estable?
Cuando se realiza un ordenamiento múltiple (por ejemplo, primero por apellido y luego por edad) o cuando 
los datos tienen atributos que se deben preservar en orden.

3) ¿Cuántos swaps hace Bubble Sort en el peor caso?
En el peor caso (cuando el arreglo está completamente invertido), Bubble Sort realiza aproximadamente [n(n-1)]/2 swaps,
lo cual corresponde a una complejidad de O(n^2). Tanto el número de comparaciones como de intercambios es cuadrático en el peor caso.

4) ¿Qué relación hay entre estabilidad y número de swaps?
No hay una relación directa. Un algoritmo puede ser estable y hacer muchos swaps (como Bubble Sort), o 
ser inestable y hacer pocos swaps (como Selection Sort). La estabilidad depende del tipo de comparaciones
 e intercambios, no de cuántos se hacen.
*/