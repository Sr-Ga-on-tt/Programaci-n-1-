import java.util.Scanner;

public class Ej15 {

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
        long numero = 0;
        boolean entradaValida = false;

        // Bucle que valida que sea un entero positivo
        while (!entradaValida) {
            System.out.print("Ingresa un número entero positivo: ");
            
            if (sc.hasNextLong()) {
                numero = sc.nextLong();
                if (numero > 0) {
                    entradaValida = true; // Es un entero positivo, salimos del bucle
                } else {
                    System.out.println("Error: El número debe ser mayor que 0.");
                }
            } else {
                System.out.println("Error: Por favor, ingresa un número entero válido.");
                sc.next(); // Limpiar el búfer del scanner
            }
        }

        // Verificación de número primo
        if (esPrimo(numero)) {
            System.out.println("El " + numero + " es primo.");
        } else {
            System.out.println("El " + numero + " no es primo.");
        }

        sc.close();
    }
}