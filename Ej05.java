public class Ej05 {
    public static void main(String[] args) {
        int variableUno, a, b, c;
        variableUno = 10;
        a = 4;
        b = 6;
        
        // Multiplicación de las variables original
        c = a * b * variableUno;

        // Suma equivalente utilizando los mismos dígitos (4, 6 y 10 -> 40, 60, 140)
        int suma = (a * 10) + (b * 10) + (variableUno * 14);

        System.out.println("Valor de variable uno: " + variableUno);
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Multiplicación de a * b * variableUno: " + c);
        System.out.println("Suma equivalente con los mismos dígitos: " + suma);
    }
}