package contaBancaria;

public class Investimento extends Conta{

    private String ativo;
    private double Vinvestido;
    private double SaldoInvestido;


    public Investimento(String nome, double saldo, int id) {
        super(nome, saldo, id);
        //TODO Auto-generated constructor stub
    }



    public void Investir(String ativo, double Vinvestido){
        saldo = saldo - Vinvestido;
        SaldoInvestido = saldo;
        System.out.println("Investimento realizado com sucesso!!\n" + 
        "Ativo: " + ativo + "\n"+
        "Valor investido: " + Vinvestido +  "\n" +
        "Saldo total em investimento: " + SaldoInvestido);
    }



    public String getAtivo() {
        return ativo;
    }

    public String setAtivo(String ativo) {
        return ativo;
    }

    public double getVinvestido() {
        return Vinvestido;
    }

    public void setVinvestido(double vinvestido) {
        Vinvestido = vinvestido;
    }

    public double getSaldoInvestido() {
        return SaldoInvestido;
    }

    public void setSaldoInvestido(double saldoInvestido) {
        SaldoInvestido = saldoInvestido;
    }

    

}
