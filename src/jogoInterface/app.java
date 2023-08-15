package jogoInterface;

public class app {
    public static void main(String[] args) {
        
        xadrez game = new xadrez();
        game.jogar();

        game.moverVert("Avançar");
        game.moverVert("Avançar");
        game.moverVert("Avançar");
        game.moverVert("Avançar");
        game.moverVert("Voltar");

        game.Atacar("atacar Direita");

    }
}
