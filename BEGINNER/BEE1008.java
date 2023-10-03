import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double amountPerHour = sc.nextDouble();
        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", workedHours * amountPerHour);
        sc.close();
    }
}
