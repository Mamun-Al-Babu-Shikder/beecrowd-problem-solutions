import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);
        for (int note : notes) {
            int n = value / note;
            value = value % note;
            System.out.printf("%d nota(s) de R$ %d,00\n", n, note);
        }
        sc.close();
    }
}
