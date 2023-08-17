package jogoInterface;

public class app {
    public static void main(String[] args) {
        
        BatalhaNaval game = new BatalhaNaval();
        
        game.jogar();

        game.moverVert("Avançar");
        game.Atacar("Direita");
        game.Atacar("Esquerda");
        game.moverVert("voltar");
        game.moverVert("voltar");
        game.moverVert("voltar");
        game.moverVert("voltar");
        game.moverVert("voltar");

        game.fechar();

        

    }
}
