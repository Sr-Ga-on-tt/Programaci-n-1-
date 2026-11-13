public class Ej03 {
public static void main(String[] arge) {
  int variableUno, a, b, c, d;
  variableUno=10;
a=4;
b=6;
c= a+b+variableUno;

d=b;
b=a;
a=d;
System.out.println("Valor de a: " + a);
System.out.println("Valor de b: " + b);

}
}