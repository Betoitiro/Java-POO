package contaBancaria;

public class app {
    public static void main(String[] args) {
        Conta conta = new Conta();
    
        conta.Entrar();
        System.out.println();//quebra de linha 


        conta.setdepositar(100.0); 
        
        conta.setSacar(200);
    
    }
}
