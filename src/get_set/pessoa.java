package get_set;

public class pessoa {
    
    private String nome  ="beto";
    private int idade = 17;
    private double altura = 1.7;


    //modificar --> setNomeDaVariavel
    //pegar --> getNomeDaVariavel
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void  setAltura(double altura){
        this.altura = altura;
    }
}
