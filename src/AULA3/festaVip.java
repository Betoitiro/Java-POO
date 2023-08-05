package AULA3;
public class festaVip {
    
    int quantidadeCafe = 30;
    int quantidadeSalgado = 50;



    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // <modificador> <retorno metodo> <nome - metodo>



    private void beberCafe(){
        quantidadeCafe --;
        System.out.println("Bebeu 1 xicara de café");
        System.out.println(quantidadeCafe);

    }

    private void comerSalgado(){
        quantidadeSalgado --;
          System.out.println("Comeu 5 salgados");
          System.out.println(quantidadeSalgado);

    }
}
