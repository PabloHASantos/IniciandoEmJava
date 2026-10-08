package ExercicioPOO;

import Entities.Estudante;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio03 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante aluno = new Estudante();


        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60){
            System.out.println("Reprovado!");
            System.out.printf("Faltou %.2f pontos", aluno.diferenca());
        }else{
            System.out.println("Pass");
        }

        sc.close();
    }
}
