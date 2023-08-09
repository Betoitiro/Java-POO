package classe;

public class app {
    public static void main(String[] args) {
        circulo circuloP = new circulo(2);

        //double area = circuloP.calcularArea();
        System.out.println("A area do circulo corresponde a " + 
        circuloP.calcularArea());

        quadrado quadrado = new quadrado(5);
       // double areaQ = quadrado.calcularArea();
        System.out.println("A area do quadrado corresponde a " +
        quadrado.calcularArea());

        qualculadorArea calcular = new qualculadorArea();

        System.out.println("A area das duas formas geometricas corresponde a " + 
        calcular.somarAreas(quadrado, circuloP));
    }
}
