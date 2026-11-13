import java.util.Scanner;

public class Ej14 {

    public static boolean esPrimo(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        long numero = sc.nextLong();

        if (esPrimo(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        sc.close();
    }
}