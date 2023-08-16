package jogoInterface;

public class xadrez implements jogo{

    public int x = 0;
    public int y = 0;



    @Override
    public void jogar() {
        System.out.println("posição x " + x);
        System.out.println("posição y " + y);
    }

    

    public void moverVert(String direcao){
        //implementar while switch/ case com acressimo de break
        //switch case if break
        if(direcao == "Avançar"){
            x++;
            System.out.println("Avançando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y);  
            if(x == 20){
                System.out.println("fim de jogo");
                x =0;
                y =0;
                System.out.println("posição de x é " + x);
                System.out.println("posição de y é " + y);  
            }
        }else if(direcao == "Voltar"){
            x--;
            //colocar condição de quando chegar a 0 o programa n ficar menor que 0
            System.out.println("Avançando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y); 
        }else{
            System.out.println("A posição de x");
        }
    }

    //public void moverOrizont(String direcao2)

    public void Atacar(String atacar){
        if(atacar == "Direita"){
            x++;
            y++;
            System.out.println("atacando...");
            System.out.println("posição de x é " + x);
            System.out.println("posição de y é " + y); 
        }else if (atacar == "Esquerda"){
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
