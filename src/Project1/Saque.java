package Project1;

public class Saque extends Score {
    public double Saque;

    public Saque(String nome, int agencia, double saldo, double valor, double income) {
        super(nome, agencia, saldo, valor, income);
        //TODO Auto-generated constructor stub
    }



    public void saque(double saque){
        saldo = saldo - Saque;
    }
    
}
