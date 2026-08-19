package ExerciciosCondicionais;
import java.util.Scanner;

public class Exercicio05 {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int codigo, qtd;
        double valor;

        codigo = sc.nextInt();
        qtd = sc.nextInt();

        if(codigo == 1){
            System.out.println(qtd + " Cachorro Quente");
            valor = qtd * 4.00;
            System.out.println("Total = " + valor);
        }else if(codigo == 2){
            System.out.println(qtd + " X-Salada");
            valor = qtd * 4.50;
            System.out.println("Total = " + valor);
        }else if(codigo == 3){
            System.out.println(qtd + " X-Bacon");
            valor = qtd * 5.00;
            System.out.println("Total = " + valor);
        }else if(codigo == 4){
            System.out.println(qtd + " Torrada simples");
            valor = qtd * 2.00;
            System.out.println("Total = " + valor);
        }else if(codigo == 5){
            System.out.println(qtd + " Refrigerante");
            valor = qtd * 1.50;
            System.out.println("Total = " + valor);
        }else{
            System.out.println("Código invalido");
        }

        sc.close();
    }
}
