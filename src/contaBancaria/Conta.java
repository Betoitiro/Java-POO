package contaBancaria;

public class Conta {
    
    private String nome = "Beto";
    private double saldo = 100.0; //valor inicial 

    public void Entrar(){
        System.out.printf("Seja bem vindo %s, seu saldo atual é de %s", nome, saldo);
    }

    public double getsaldo(){
        return saldo;
    }

    public void setdepositar(double valor){
        if(valor <= 0){
            System.out.println("O valor desejado esta invalido!");
        }else{
            saldo = saldo + valor;
            System.out.println();//quebra de linha
            System.out.printf("teve um deposito no valor de R$" + valor);
            System.out.println();//quebra de linha
            System.out.printf("seu novo saldo é de R$" + saldo);
            System.out.println();
        }
    }

    public void setSacar(double saque){
        if(saque > saldo){
            System.out.println("Saldo insuficiente!!");
        }else{
            saldo = saldo - saque;
            System.out.println();//quebra de linha
            System.out.println("Foi efetuado um saque no valor de R$" + saque);
            System.out.println("Seu novo saldo é de R$" + saldo);
        }
        
    }
}
