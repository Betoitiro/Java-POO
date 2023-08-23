package ExerciciosFaculdade;

import java.util.Scanner;

public class Nivelamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int QuantidadeMulher = 0;
        double AltmediaH = 0.0;
        double QuantidadeH = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;


        for( int i = 1; i <= 3; i++){
            System.out.println("Digite seu sexo (M/F)");
            String sexo = sc.nextLine().toUpperCase();

            System.out.println();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            if(sexo.equalsIgnoreCase("f")){
                QuantidadeMulher++;
            }
            if(sexo.equalsIgnoreCase("m")){
                QuantidadeH ++;
                AltmediaH += altura;
                AltmediaH = AltmediaH / QuantidadeH;
            }

            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

        }

        System.out.println("A quantidade de mulheres corresponde a: " + QuantidadeMulher);
        System.out.printf("A maior altura capturada foi a de %s \n" + 
        "Ja a menor altura capturada foi %s \n", maiorAltura, menorAltura);
        System.out.printf("A altura media masculina é de %s", AltmediaH);

        sc.close();
    }
}
