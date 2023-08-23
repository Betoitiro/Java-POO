package Project1;

public class Usuario {
    private String nome;
    private int agencia;
    protected double saldo;
    private double Score;
    protected double valor;
    protected double income;
    
    public Usuario(String nome, int agencia, double saldo, double valor, double income) {
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
        this.valor = valor;
        this.income = income;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getincome() {
        return income;
    }

    public void setincome(double income) {
        this.income = income;
    }

    

}
