import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la longitud de los tres lados del triángulo:");
        System.out.print("Lado 1: ");
        double lado1 = lector.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = lector.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = lector.nextDouble();//Hipotenusa de un triangulo rectangulo

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es un triángulo isósceles.");

        } else if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)) {
            System.out.println("Es Triangulo rectangulo");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }

        lector.close();

    }
}
