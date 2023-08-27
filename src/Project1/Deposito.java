package Project1;

import java.util.Scanner;

public class Deposito extends Usuario{

    public Deposito() {
        super(nome, agencia, balance);
        //TODO Auto-generated constructor stub
    }

    Scanner sc = new Scanner(System.in);

    public void Deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        double value = sc.nextDouble();

        balance = balance + value;

        System.out.printf("the value deposit is => %.2f \n", value);
        System.out.printf("The new balance %.2f \n", balance);

    }
    
}
