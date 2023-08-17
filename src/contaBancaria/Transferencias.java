package contaBancaria;

public class Transferencias extends Conta{
    
    public Transferencias(String nome, double saldo, int id) {
        super(nome, saldo, id);
        //TODO Auto-generated constructor stub
    }

    public void Tranferir(String nome, double valor){
        saldo = saldo - valor;
        System.out.printf("Tranferencia para %s, no valor de %.2f \n", nome, valor);
    }
}