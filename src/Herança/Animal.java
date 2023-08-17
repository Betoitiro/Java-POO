package Herança;

public class Animal {
    private String nome;
    //private

    public Animal(String nome){
        
    }

    public void Comer(){
        System.out.printf("O %s comeu", nome);
        System.out.println();
    }
    public void Beber(){
        System.out.printf("O %s bebeu", nome);
        System.out.println();
    }
    public void latir(){
        System.out.printf("O %s latiu", nome);
        System.out.println();
    }
    public void lamber(){
        System.out.printf("O %s lambeu", nome);
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
