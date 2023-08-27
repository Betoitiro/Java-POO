package ExerciciosFaculdade;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        for(int i = 0; i <5; i++){
            System.out.println("Digite um numero: ");
            int n = sc.nextInt();

            if(n > num){
                num = n;
            }else if(n < num){
                num2 = n;
            }else{
                System.out.println("numero n encontrado!");
            }
        }
        System.out.println("o maior numero digitado foi: " + num);
        System.out.println("O menor numero digitado foi: " + num2);
    }
}
