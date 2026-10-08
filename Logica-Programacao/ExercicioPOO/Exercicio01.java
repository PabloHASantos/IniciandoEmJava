package ExercicioPOO;

import Entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();

        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        System.out.println("Diagonal = " + r.diagonal());
        sc.close();
    }
}
