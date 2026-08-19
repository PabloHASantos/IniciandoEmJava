package ExerciciosCondicionais;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x =  sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0){
            if(y == 0){
                System.out.println("Origem");
            }else{
                System.out.println("Eixo X");
            }
        }else{
            if(y == 0){
                System.out.println("Eixo Y");
            }else if(y < 0){
                //Parei aqui só porque não vai dar mais tempo de mexer
            }
        }

        sc.close();
    }
}
