package contaBancaria;

public class Conta{
    
    private String nome;
    private int SCore =9;
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
        if(saldo < saque){
            System.out.println("Saldo insuficiente!!");
        }else{
            saldo = saldo - saque;
            System.out.println();//quebra de linha
            System.out.println("Foi efetuado um saque no valor de R$" + saque);
            System.out.println("Seu novo saldo é de R$" + saldo);
        }
    }
    public void Tranferir(String nome, double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            System.out.printf("Tranferencia para %s, no valor de %.2f \n", nome, valor);           
        }else if(saldo < valor){
            if(SCore >= 10){
                //Vn =  Valor negativo
                //Vj = valor com juros que tera que ser pago
                double Vn = 0;
                saldo = saldo - valor;
                Vn = saldo;
                //para cobrar juros encima do valor emprestado pelo banco
                double Vj = Vn + (Vn * 8.5)/100;
                System.out.println("Seu saldo foi insuficiente para fazer a tranferencia!!");
                System.out.println("Avaliamos o seus Score, e percebemos que podemos financiar sua tranferencia!!");
                System.out.printf("Vamos informar os procedimentos realizados: \n" + 
                "Valor emprestado: %s \n" + 
                "Valor a ser pago: %s \n",
                Vn, Vj);

            }else{
                double Vf = valor - saldo;
                System.out.println("Valor insufiente para a Transação...");
                System.out.printf("FALTA R$%s PARA REALIZAR A ORDEM \n", Vf);
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSCore() {
        return SCore;
    }

    public void setSCore(int sCore) {
        SCore = sCore;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
}