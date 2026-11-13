import java.util.Scanner;
public class Ej13 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa las 5 calificaciones:");
        System.out.print("Español: ");
        int espanol = scanner.nextInt();
        System.out.print("Inglés: ");
        int ingles = scanner.nextInt();
        System.out.print("Matemáticas: ");
        int matematicas = scanner.nextInt();
        System.out.print("Física: ");
        int fisica = scanner.nextInt();
        System.out.print("Química: ");
        int quimica = scanner.nextInt();
        double promedio = (espanol + ingles + matematicas + fisica + quimica) / 5.0;
       System.out.println("Tu promedio es: " + promedio);
        if (promedio >= 6) {
            System.out.println("Pasas el Examen");
        } else {
            System.out.println("No pasas el Examen");
        }
    }
}