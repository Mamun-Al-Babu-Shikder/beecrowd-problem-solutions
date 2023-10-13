import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] notes = {100, 50, 20, 10, 5, 2};
        float value = sc.nextFloat();
        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = (int) (value / note);
            value %= note;
            System.out.printf("%d nota(s) de R$ %.2f\n", count, (float) note);
        }
        int[] coins = {100, 50, 25, 10, 5, 1};
        System.out.println("MOEDAS:");
        value = Math.round(value * 100);
        for (int coin : coins) {
            int count = (int) (value / coin);
            value %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, coin / 100.00f);
        }
        sc.close();
    }
}
