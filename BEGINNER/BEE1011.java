import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.printf("VOLUME = %.3f\n", (4 * 3.14159 * Math.pow(radius, 3)) / 3.0);
        sc.close();
    }
}
