package Project1;

public class Score extends Usuario {

    

    public Score(String nome, int agencia, double saldo, double score, double valor) {
        super(nome, agencia, saldo, score, valor);
        //TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public void Calculoemprestimo(){
        double score = (saldo * 100)/1000;
        if(score >=10){
            System.out.println("Seu emprestimo foi aprovado");
        }
    }
    
}
