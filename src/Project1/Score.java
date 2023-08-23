package Project1;

public class Score extends Usuario {
    int contador = 0;
    int score = 0;

    public Score(String nome, int agencia, double saldo, double valor, double income) {
        super(nome, agencia, saldo, valor, income);
        //TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public void score(){
        for( int i =1; i<=1000; i++){
            contador++;
            if(i% 100==0){
                score++;
            }

        }        
        if(score >10){
            
            System.out.println("Seu Score corresponde com a oportunidade de emprestimo!");
        }else{
            System.out.println("Score indisponivel");
        }
    }
    
}
