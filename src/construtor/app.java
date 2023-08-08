package construtor;

public class app {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Bob Esponja", 89, 1.6);

        //p1.setNome("Roberto");
        //p1.setIdade(19);
        //p1.setAltura(2.25);

        /*System.out.printf("Nome: %s " + 
        " Idade: %d altura: %.2f ", 
        p1.getNome(), 
        p1.getIdade(),
        p1.getAltura() );
        */

        p1.imprimirDados();
    }
}
