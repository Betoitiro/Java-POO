package Project1;

public class ValorEmprestimo extends Usuario {



    public ValorEmprestimo(String nome, int agencia, double saldo, double score, double valor, double income) {
        super(nome, agencia, saldo, score, valor, income);
        //TODO Auto-generated constructor stub
    }

    public void emprestimo(){
        double newValue = (valor/12);
        double newValueF = newValue *5;
        double y = (income * 30)/100;
        if(newValue > y){
            System.out.println("O valor do emprestimo n condiz com a sua income mensal");
        }
    
    }
    
}
