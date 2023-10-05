import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double maiorAB = (a + b + Math.abs(a - b)) / 2.0;
        double greatest = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.printf("%d eh o maior\n", (int) greatest);
        sc.close();
    }
}
