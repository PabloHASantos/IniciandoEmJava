package ExerciciosExemplo;

import Entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class ComPOO {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new  Triangle();
        y = new  Triangle();

        System.out.println("Digite os três lados do primeiro triângulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os três lados do primeiro triângulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();


        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.printf("Large area: %.4f%n", areaX);
        }
        else {
            System.out.printf("Large area: %.4f%n", areaY);
        }

        sc.close();
    }
}
