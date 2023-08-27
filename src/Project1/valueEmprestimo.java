package Project1;

import java.util.Scanner;

public class valueEmprestimo extends Usuario {


    //extends da classe Score, com seus atributos e construtor
    public valueEmprestimo() {
        super(nome, agencia, balance);
        //TODO Auto-generated constructor stub
    }
    Scanner sc = new Scanner(System.in);
    
    public void loan(){
        System.out.println("Enter the value of loan: ");
        double value = sc.nextDouble();

        double newValue = (value/60);
        // 'newValue' corresponds to the value of each installment over the course of 60 months
        double j = newValue + (newValue * 12)/100;
        // 'j' corresponds to the interest accumulated each month
        double newValueF = j * 60;
        double y = balance - (balance * 30)/100;
        // 'newValueF' corresponds to the value that should be paid after 60 months
        if(newValue > y){
            // Condition for denying the loan if the loan value is greater than 30% of the income
            System.out.println("The loan amount does not match your monthly income.");
        } else {
            double Nv = balance + value;
            System.out.println("yor new balance is: " + Nv);
            System.out.printf("The loan amount of R$%.2f can be granted to the client! \n", value);
            System.out.printf("The value of each installment to be paid over 5 years corresponds to R$%.2f \n", j);
            System.out.printf("The loan amount will be R$%.2f \n", newValueF);
        }
        
        
    
    }
    
}
