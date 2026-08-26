package ExerciciosRepetitivas;
import java.util.Scanner;


public class Exercicio01 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        System.out.println("Digite sua senha: ");
        int senhaDigitada = sc.nextInt();

        while(senhaDigitada != senha){
            System.out.println("Senha invalida! Tente novamente:");
            senhaDigitada = sc.nextInt();
        }
        System.out.println("Acesso permitido!!");

        sc.close();
    }
}
