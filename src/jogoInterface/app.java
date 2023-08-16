package jogoInterface;

public class app {
    public static void main(String[] args) {
        
        xadrez game = new xadrez();
        
        game.jogar();

        game.moverVert("Avançar");
        game.Atacar("Direita");
        game.Atacar("Esquerda");

        game.fechar();

        

    }
}
