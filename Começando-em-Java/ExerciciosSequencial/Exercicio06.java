package ExerciciosSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, area;

        System.out.println("Digite 3 valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        area = (a * c) / 2; // area triangulo
        System.out.printf("Triangulo: %.3f%n", area);

        area = Math.PI * Math.pow(c, 2);
        System.out.printf("Circulo: %.3f%n", area);

        area = (a + b) * c / 2;
        System.out.printf("Trapézio: %.3f%n", area);

        area = Math.pow(b, 2);
        System.out.printf("Quadrado: %.3f%n", area);

        area = a * b;
        System.out.printf("Retangulo: %.3f%n", area);


        sc.close();
    }
}
