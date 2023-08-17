package Herança;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
        }

    public void correr(){
        System.out.printf("O %s correu", getNome());
    }
}
