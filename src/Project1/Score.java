package Project1;

import java.util.Scanner;

public class Score extends Usuario {
    int contador = 0;
    int score = 0;

    public Score(String nome, int agencia, double balance, double value, double income) {
        super(nome, agencia, balance);
        //TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    Scanner sc = new Scanner(System.in);
    public void score(){
        System.out.println("Report your monthly income: ");
        double income = sc.nextDouble();
            double c = value - (value*30)/100;
         // var c => 30% do salario
            double y = c/12;
         //var y =>
        if(income > y){
            System.out.println("Score approved!");
        }else{
            System.out.println("Score denied!");
        }
    }
    
}
