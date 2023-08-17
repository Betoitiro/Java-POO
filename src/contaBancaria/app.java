package contaBancaria;

public class app {
    public static void main(String[] args) {
        Conta c1 = new Conta("humberto", 1400, 74);
        c1.Saldo();
        c1.Tranferir("humberto", 1500);
        c1.Saldo();

        /* 
         //O valor do Investimento (salddo), corresponde ao valor que o usuario tem na corretora de investimento
        Investimento i1 = new Investimento("Humberto", 1400, 74);
        i1.Investir("MXRF11", 338);
        */
    }
}
