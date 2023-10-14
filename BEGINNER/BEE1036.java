import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0 || a == 0) {
            System.out.println("Impossivel calcular");
            return;
        }
        d = Math.sqrt(d);
        double r1 = (-b + d) / (2 * a);
        double r2 = (-b - d) / (2 * a);
        System.out.printf("R1 = %.5f\n", r1);
        System.out.printf("R2 = %.5f\n", r2);
        sc.close();
    }
}
