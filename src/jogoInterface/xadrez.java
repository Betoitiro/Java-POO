package jogoInterface;

public class xadrez implements jogo{

    int x = 0;
    int y = 0;



    @Override
    public void jogar() {
        System.out.println(x);
        System.out.println(y);
    }

    

    public void moverVert(String direcao){
        if(direcao == "Avançar"){
            x++;
            System.out.println("Avançando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y);  
            if(x == 20){
                System.out.println("fim de jogo");
                x =0;
                System.out.println("posição de x é " + x);
                System.out.println("posição de y é " + y);  
            }
        }else if(direcao == "Voltar"){
            x--;
            System.out.println("Avançando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y); 
        }else{
            System.out.println("A posição de x");
        }
    }

    //public void moverOrizont(String direcao2)

    public void Atacar(String atacar){
        if(atacar == "atacar Direita"){
            x++;
            y++;
            System.out.println("atacando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y); 
        }else if (atacar == "atacar Esquerda"){
            x++;
            y--;

            System.out.println("atacando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y); 

        }else{
            System.out.println("posição n encontrada...");
        }

    }

    @Override
    public void fechar() {
        System.out.println("Fim de jogo");
    }

    
}
