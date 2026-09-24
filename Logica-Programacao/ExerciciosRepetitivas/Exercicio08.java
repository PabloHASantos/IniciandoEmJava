package ExerciciosRepetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
