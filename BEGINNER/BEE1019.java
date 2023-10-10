import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours, minutes;
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        sc.close();
    }
}
