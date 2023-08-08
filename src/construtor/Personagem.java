package construtor;

public class Personagem {
    //Atributos da classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    

    //Metodo construtor
    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 1000;
        if(classe.equalsIgnoreCase("Guerreiro")){
            forca = nivel * 3;
        }else if(classe.equalsIgnoreCase("Ladrão")){
            forca = nivel *2;
        }else{
            System.out.println("força não contabilizada!!");
        }
    }

    //Metodos especificos

    public void mostrarStatus(){
        System.out.printf("Nome: %s \n Nivel: %d\n Vida:  %d \n Classe: %s \n Força: %d",
        nome,
        nivel,
        vida,
        classe,
        forca);
    }

    //Metodo gettres and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getClasse(){
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    
}
