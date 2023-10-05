import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n", 0.5 * a * c); // triangle = 1/2 * base * height
        System.out.printf("CIRCULO: %.3f\n", 3.14159 * c * c); // circle = PI * R^2
        System.out.printf("TRAPEZIO: %.3f\n", 0.5 * (a + b) * c); // trapezium = 1/2 * (base1 + base2) * height
        System.out.printf("QUADRADO: %.3f\n", b * b); // square = side ^ 2
        System.out.printf("RETANGULO: %.3f\n", a * b); // rectangle = length * width
        sc.close();
    }
}
