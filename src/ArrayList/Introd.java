package ArrayList;

import java.util.ArrayList;

public class Introd {
    public static void main(String[] args) {
                //Array (vetor) -> com tamanho fisico de 3 posições;
        String[] Estatic = new String[3];
        //ArrayList <tipo> nome = new ArrayList<tipo>();
        Estatic[0]= "humberto";
        Estatic[1] = "Remerson";
        Estatic[2] = "João";
        Estatic[3]= "neto"; 

        System.out.println(Estatic[0]);
        
        ArrayList <String> arrayDinamico = new ArrayList<String>(null);
        arrayDinamico.add("humberto");
        arrayDinamico.add("Rmerson");
        arrayDinamico.add("Hercules");
        arrayDinamico.add("BobEsponja");


        System.out.println("Imprimindo EStatic ");
        for( int indice =0;indice <Estatic.length; indice++){
            System.out.println(Estatic[indice]);
        }

        System.out.println("Tamanho do ArrayList" + arrayDinamico.size()); 
        
    }
}
