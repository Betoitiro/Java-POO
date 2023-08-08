package construtor;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;

    //Metodo construtor
        //<modificador> <nome da classe>()>

    public Pessoa(String nome, int idade, double altura){
       this.nome = nome;
       this.idade = idade;
       this.altura = altura;
       
        //pode da atributo inicial para um objeto
            //altura = 1.5;
    }

    public void imprimirDados(){
        System.out.printf(" Nome: %s \n Idade: %d \n Altura: %.2f",
        nome,
        idade,
        altura);
    }

    //Metodos getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    

}
