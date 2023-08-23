package Project1;

public class ValorEmprestimo extends Score {



    public ValorEmprestimo(String nome, int agencia, double saldo, double valor, double income) {
        super(nome, agencia, saldo, valor, income);
        //TODO Auto-generated constructor stub
    }

    public void emprestimo(){
        double newValue = (valor/12);
        double newValueF = newValue *5;
        double y = (income * 30)/100;
        if(newValue > y){
            System.out.println("O valor do emprestimo n condiz com a sua income mensal");
        }else{
            System.out.println("O valor do emprestimo pode ser concedido ao cliente!");
            System.out.printf("O valor de cada parcela para ser pago em 5 anos corresponde a %.2f \n", newValue);
        }
    
    }
    
}
