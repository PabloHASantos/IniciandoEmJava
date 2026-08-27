package ExerciciosRepetitivas;
import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de repetições: ");
        int n = sc.nextInt();
        int somaIn = 0, somaOut = 0;

        for(int i=0; i<n; i++){
            System.out.println("Digite um valor inteiro: ");
            int valor = sc.nextInt();
            if(valor>=10 && valor<=20){
                somaIn += 1;
            }else{
                somaOut += 1;
            }
        }

        System.out.println(somaIn + " in");
        System.out.println(somaOut + " out");

        sc.close();
    }
}
