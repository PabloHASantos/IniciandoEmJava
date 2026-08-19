package ExerciciosCondicionais;
import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();


        if(horaInicial < horaFinal){
            duracao = horaInicial - horaFinal;
        }else{
            duracao = 24 - (horaInicial - horaFinal);
        }

        System.out.println("O jogo durou "+ duracao +" horas!");
        sc.close();
    }
}
