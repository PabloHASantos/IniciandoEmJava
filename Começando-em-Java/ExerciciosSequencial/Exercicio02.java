package ExerciciosSequencial;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio02 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double r, pi, area;

        pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        r = sc.nextDouble();
        area = pi*(Math.pow(r, 2));

        System.out.println("Área igual a: " + area);


        sc.close();
    }
}
