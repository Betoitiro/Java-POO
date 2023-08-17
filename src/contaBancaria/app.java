package contaBancaria;

public class app {
    public static void main(String[] args) {
        Conta c1 = new Conta("humberto", 1400, 74);
        c1.Saldo();

        Transferencias t1 = new Transferencias("humberto", 1400, 74);
        t1.Tranferir("Beto", 700);
        t1.Saldo();

        Investimento i1 = new Investimento("Humberto", 1400, 74);
        i1.Investir("MXRF11", 338)  ;
    }
}
