package ExerciciosFaculdade;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu numero: ");
        double num = sc.nextDouble();

        if(num%2 ==0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar ");

        }
    }
}
