package ExerciciosFaculdade;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Seja bem vindo ao portal do aluno!!");

        System.out.println("Insira a sua primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.println(":Insira a sua segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.println("Insira a sua terceira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3)/3;

        System.out.printf("A media do aluno foi de: %s", media);
        System.out.printf("\n Primeira nota: %s \n Segunda nota: %s \n Terceira nota: %s ", n1,n2,n3);
    }
}
