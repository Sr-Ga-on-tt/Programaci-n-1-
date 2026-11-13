import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingresa el segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("\n---------------------CALCULADORA---------------------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        System.out.println("Ingresa la opcion:");
        int opcion = scanner.nextInt();
        
        switch(opcion){
            case 1:
                double suma = numero1 + numero2;
                System.out.println("Resultado: " + suma);
                break;
            case 2:
                double resta = numero1 - numero2;
                System.out.println("Resultado: " + resta);
                break;
            case 3:
                double multiplicacion = numero1 * numero2;
                System.out.println("Resultado: " + multiplicacion);
                break;
            case 4:
                if (numero2 != 0) {
                    double division = numero1 / numero2;
                    System.out.println("Resultado: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        
        scanner.close();
    }
}