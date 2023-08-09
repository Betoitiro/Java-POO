package jogoInterface;

public class pingPong implements jogo{

    @Override
    public void fechar() {
        System.out.println("salvar progresso do jogo");
        System.out.println("Fechar o jogo");


    }

    @Override
    public void jogar() {
        System.out.println("Cutscene inicial");
        System.out.println("Mostrando o menu inicial");
        System.out.println("tocando musica de fundo");
    }
    
}
