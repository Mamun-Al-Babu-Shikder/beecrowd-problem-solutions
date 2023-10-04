import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int item = 2;
        double totalAmount = 0.0;
        for (int i=0; i<item; i++) {
            int code = sc.nextInt();
            int units = sc.nextInt();
            double price = sc.nextDouble();
            totalAmount += units * price;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);
        sc.close();
    }
}
