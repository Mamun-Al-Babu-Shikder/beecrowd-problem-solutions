import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float avg = (a * 2 + b * 3 + c * 4 + d) / 10;
        System.out.printf("Media: %.1f\n", avg);
        if (avg >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if (avg >= 5.0f && avg <= 6.9f) {
            System.out.println("Aluno em exame.");
            float e = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", e);
            float avg2 = (avg + e) / 2;
            if (avg2 >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", avg2);
        } else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
