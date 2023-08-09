package classe;

public class quadrado {
    
    //atributo
    private int lado;

    //construtor    
    public quadrado(int lado){
        this.lado = lado;
    }

    //metodo especifico
    public double gerarArea(){
        return Math.pow(lado, 2);
        //a função pow da biblioteca não retorna valor inteiro, ou seja, o metodo especifico 
        //teria que ser double tambem
    }


    //metodo getters and setters

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    
}
