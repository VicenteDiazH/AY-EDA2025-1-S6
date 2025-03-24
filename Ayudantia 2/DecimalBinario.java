//Escribe un programa en Java que convierta un número entero a su representación binaria.

import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        String binario = "";
        while(numero != 0){
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }
        System.out.println("El número en binario es: " + binario);
    }

}