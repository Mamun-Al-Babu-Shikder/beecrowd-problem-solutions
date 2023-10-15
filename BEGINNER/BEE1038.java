import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        float[] prices = {4.00f, 4.50f, 5.00f, 2.00f, 1.50f};
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int quantity = sc.nextInt();
        System.out.printf("Total: R$ %.2f\n", (prices[code - 1] * quantity));
        sc.close();

    }
}
