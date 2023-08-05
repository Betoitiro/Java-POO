package AULA2;

public class aplic {
    public static void main(String[] args) throws Exception {
        
        personagem heroi = new personagem();
        heroi.nome  = "Hercules";
        heroi.nivel = 25;
        heroi.forca = 15;
        heroi.defesa = 5;
        
        System.out.println("Status do heroi: ");
        heroi.mostrarStatus();

        System.out.println(); //quebra de linha
        System.out.println();

        System.out.println("Movimentação do heroi:  ");
        
        //hydra é o argumento do metodo atacar  
        heroi.atacar("hydra", "");

    }


    
}
