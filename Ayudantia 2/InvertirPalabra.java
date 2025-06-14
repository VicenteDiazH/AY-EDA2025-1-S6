//Escribe un programa en Java que invierta una palabra ingresada por el usuario
import java.util.Scanner;

public class InvertirPalabra {

    public static String invertirPalabra(String palabra) {
        char[] caracteres = palabra.toCharArray();
        char[] resultado = new char[caracteres.length];
        
        for (int i = 0; i < caracteres.length; i++) {
            resultado[i] = caracteres[caracteres.length - 1 - i];
        }
        
        return new String(resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        String palabraInvertida = invertirPalabra(palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

}