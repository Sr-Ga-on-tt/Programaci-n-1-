import java.util.Scanner;
public class Ej10 
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("ingresa tu estatura: ");
        double estatura = scanner.nextDouble();
        System.out.println("Hola " + nombre + ", tienes " + edad + " , mides " + estatura + " metros.");     
    }
}