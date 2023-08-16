package AULA1;
 public class aula1 {

    //exemplo de um celular

    String nome;
    String sistemaOperacional;
    int espacoArmazenamento;
    double tamanhoTela; //poderia usar float nesse exemplo


    public static void main(String[] args) {
        //iphone 13, tela de 6,1, 256gb
        //GAlaxy S23, tela de 6,9, 256gb
        //xiomi mi 11 pro, tela de 6,81, 128gb

        //declarando um objeto tipo celelular = instanciando um objeto
        aula1 celular = new aula1();

        celular.nome = "Iphone 12";
        celular.tamanhoTela = 6.1;
        celular.espacoArmazenamento = 256;
        celular.sistemaOperacional = "IOS";

        System.out.println("Celular " + celular.nome + ", possui " + celular.espacoArmazenamento + " de armazenamento, uma tela de "
        + celular.tamanhoTela + " polegadas e um sistema operacional " + celular.sistemaOperacional);

        System.out.println(); //QUEBRA DE LINHA

        //System.out.format("celular %s com tela de %f, %e de armazenamento, e sistema operacional %i",
        //celular.nome, celular.tamanhoTela, celular.espacoArmazenamento, celular.sistemaOperacional);


        aula1 celular2 = new aula1();

        celular2.nome = "Galaxy S23";
        celular2.tamanhoTela = 6.9;
        celular2.espacoArmazenamento = 256;
        celular2.sistemaOperacional = "Android";

        System.out.println("Celular " + celular2.nome + ", possui " + celular2.espacoArmazenamento + " de armazenamento, uma tela de "
        + celular2.tamanhoTela + " polegadas e um sistema operacional " + celular2.sistemaOperacional);

        System.out.println(); //QUEBRA DE LINHA

        // System.out.format("celular %s com tela de %f, %e de armazenamento, e sistema operacional %i",
        //celular2.nome, celular2.tamanhoTela, celular2.espacoArmazenamento, celular2.sistemaOperacional);


        aula1 celular3 = new aula1();
        
        celular3.nome = "Xiome 11 Pro";
        celular3.tamanhoTela = 6.81;
        celular3.espacoArmazenamento = 128;
        celular3.sistemaOperacional = "Android";


        System.out.println("Celular " + celular3.nome + ", possui " + celular3.espacoArmazenamento + " de armazenamento, uma tela de "
        + celular3.tamanhoTela + " polegadas e um sistema operacional " + celular3.sistemaOperacional);


    }

 }