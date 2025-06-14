import java.util.Scanner;

public class DescomposicionBilletes {
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un monto en dólares: ");
        int monto = scanner.nextInt();
        
        int[] denominaciones = {100, 50, 20, 10, 5, 2, 1};
        int[] cantidadBilletes = new int[denominaciones.length];
        
        for (int i = 0; i < denominaciones.length; i++) {
            cantidadBilletes[i] = monto / denominaciones[i];
            monto %= denominaciones[i];
        }
        
        System.out.println("Descomposición del monto:");
        for (int i = 0; i < denominaciones.length; i++) {
            System.out.println(cantidadBilletes[i] + " billete(s) de U$S " + denominaciones[i]);
        }
    }
        */

    public static void main(String[] args) {
        int cant100, cant50, cant20, cant10, cant5, cant2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un monto en dólares: ");
        int monto = scanner.nextInt();

        cant100 = monto/100;
        monto = monto%100;

        cant50 = monto/50;
        monto = monto%50;

        cant20 = monto/20;
        monto = monto%20;

        cant10 = monto/10;
        monto = monto%10;

        cant5 = monto/5;
        monto = monto%5;

        cant2 = monto/2;
        monto = monto%2;

        System.out.println("Cantidad de billetes de 100: " + cant100);
        System.out.println("Cantidad de billetes de 50: " + cant50);
        System.out.println("Cantidad de billetes de 20: " + cant20);
        System.out.println("Cantidad de billetes de 10: " + cant10);
        System.out.println("Cantidad de billetes de 5: " + cant5);
        System.out.println("Cantidad de billetes de 2: " + cant2);
        
    }
}