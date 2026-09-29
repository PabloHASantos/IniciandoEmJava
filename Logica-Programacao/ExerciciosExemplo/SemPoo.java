package ExerciciosExemplo;

import java.util.Locale;
import java.util.Scanner;

public class SemPoo {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três lados do primeiro triângulo: ");
        double t1LadoA = sc.nextDouble();
        double t1LadoB = sc.nextDouble();
        double t1LadoC = sc.nextDouble();

        System.out.println("Digite os três lados do primeiro triângulo: ");
        double t2LadoA = sc.nextDouble();
        double t2LadoB = sc.nextDouble();
        double t2LadoC = sc.nextDouble();

        double p1 = (t1LadoA + t1LadoB + t1LadoC) / 2;
        double p2 = (t2LadoA + t2LadoB + t2LadoC) / 2;

        double area1 = Math.sqrt((p1 * (p1 - t1LadoA) * (p1 - t1LadoB) * (p1 - t1LadoC)));
        double area2 = Math.sqrt((p2 * (p2 - t2LadoA) * (p2 - t2LadoB) * (p2 - t2LadoC)));

        System.out.println("Triângulo nº 1 area = " + area1);
        System.out.println("Triângulo nº 2 area = " + area2);

        if(area1 > area2){
            System.out.println("Larger area: " + area1);
        }
        else {
            System.out.println("Larger area: " + area2);
        }

        sc.close();
    }
}
