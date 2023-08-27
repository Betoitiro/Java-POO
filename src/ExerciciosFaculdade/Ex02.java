package ExerciciosFaculdade;

import java.util.Scanner;

public class Ex02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int n = sc.nextInt();
        System.out.println("Insira outro numero");
        int n1 = sc.nextInt();

        if(n > n1){
            System.out.println("" + n + " é maior que " + n1);
        }else{
            System.out.println(" " + n1 + " é maior que " + n);
        }

     }
}
