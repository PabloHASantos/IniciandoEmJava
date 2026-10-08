package ExercicioPOO;

import Entities.Funcionario;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        func.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: "+func);
        System.out.println();
        System.out.print("Qual porcentagem do aumento: ");
        double porcentagem = sc.nextDouble();
        func.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Update data: "+func);

        sc.close();
    }
}
