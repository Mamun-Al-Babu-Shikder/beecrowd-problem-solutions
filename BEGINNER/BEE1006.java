import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = (a * 2 + b * 3 + c * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
        sc.close();
    }
}
