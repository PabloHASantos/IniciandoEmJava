package ExerciciosCondicionais;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {
    static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double ir;
        double salario = sc.nextDouble();

        if (salario > 4500.00) {
            ir = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500) * 0.28);
            System.out.printf("R$ %.2f%n", ir);
        }
        else if (salario > 3000.00){
            ir = (1000.00 * 0.08) + ((salario - 3000) * 0.18);
            System.out.printf("R$ %.2f%n", ir);
        }
        else if (salario > 2000.00){
            ir = (salario - 2000.00) * 0.28;
            System.out.printf("R$ %.2f%n", ir);
        }
        else{
            System.out.println("Isento");
        }


        sc.close();
    }
}
