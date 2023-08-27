package Project1;

public class Usuario {
    protected static String nome;
    public static int agencia;
    protected static double balance;
    private double Score;
    protected static double value;
    protected static double income;
    
    public Usuario(String nome, int agencia, double balance) {
        Usuario.nome = nome;
        Usuario.agencia = agencia;
        Usuario.balance = balance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Usuario.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        Usuario.agencia = agencia;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        Usuario.balance = balance;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public double getvalue() {
        return value;
    }

    public void setvalue(double value) {
        Usuario.value = value;
    }

    public double getincome() {
        return income;
    }

    public void setincome(double income) {
        Usuario.income = income;
    }

    

}
