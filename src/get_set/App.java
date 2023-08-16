package get_set;

public class App {
    
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        
        p1.getNome();
        p1.setNome("Beto");
        p1.setIdade(18);
        p1.setAltura(1.8);

        String nome = p1.getNome();
        int idade = p1.getIdade();
        double altura = p1.getAltura();

        System.out.printf("Me chamo %s e tenho %s anos de idade e tenho " + 
        "%s de altura", nome, idade, altura);

    }
    

}
