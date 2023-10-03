import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sellerName = sc.next();
        double salary = sc.nextDouble();
        double sold = sc.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n", salary + ((sold * 15) / 100));
        sc.close();
    }
}
