package contaBancaria;

public class Conta{
    
    private String nome;
    protected double saldo;
    private int id;

    public Conta(String nome, double saldo, int id){
        this.nome = nome;
        this.saldo = saldo;
        this.id = id;
    }

    public void Entrar(){
        System.out.printf("Seja bem vindo %s %s, seu saldo atual é de %s", nome,id, saldo);
    }

    public void Saldo(){
        System.out.println("Seu saldo atual é de " + saldo);
    }

    public void Depositar(double valor){
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

    public void Saque(double saque){
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