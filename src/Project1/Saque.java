package Project1;

import java.util.Scanner;

public class Saque extends Usuario {
    public double Saque;

    public Saque() {
        super(nome, agencia, balance);
        //TODO Auto-generated constructor stub
    }

    Scanner sc = new Scanner(System.in);

    public void sacar(){
        System.out.println("Enter the amount you wish to withdraw: ");
        double Saque = sc.nextDouble();
        //atribui um metodo SCanner para poder inserir o valor que devera ser sacado
        balance = balance - Saque;
        //var balance sera o balance menos o valor do saque
        System.out.printf("a withdrawal was made in the amount of: %.2f\n", Saque);
        System.out.printf("you corrent balance is: %.2f\n",balance);
    }
    
}
