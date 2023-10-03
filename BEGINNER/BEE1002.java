import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        final double n = 3.14159;
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double A = n * R * R;
        System.out.printf("A=%.4f\n", A);
        sc.close();
    }
}
