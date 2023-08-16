package AULA2;

import java.util.Random;

public class personagem{
    String nome;
    int nivel;
    int forca;
    int defesa;

    //void -> significa que não esta retornando
    public void mostrarStatus(){
        System.out.printf("%s (lvl %d), tem %s de forca e %s de defesa", nome, nivel, forca, defesa);
        //void para da retornos das informações;/ status do heroi
    }

    //metodo para sortear e calcular o dano do heroi
    int calcularDano(){
        //comando para sortear um valor de 1 ate 20
        Random gerador = new Random();
        //1 ... 20
        //0...19
        // 0 + 1 = 1...20
        int dado20Faces = 1 + gerador.nextInt(19);

        //operação de soma da força com o numero sorteado para resultar no ataque final
        int dano = forca + dado20Faces;

        return dano;
        
    }
    //retorno das informações do alvo, da habilidade usada e do dano causado
    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano(); //acrecentar as informações do metodo ao argumento
        if(habilidade.length()==0){
            //possibilidade de por caracteristicas do ataque ou não
            System.out.printf("%s, atacou %s e causou  %s de dano", nome,alvo, danoCausado);
        } else{
            System.out.printf("%s, atacou %s, usando %s e causou e %s de dano", nome,alvo, habilidade, forca);

        }
    }
}