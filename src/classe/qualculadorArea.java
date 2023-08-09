package classe;

public class qualculadorArea {
    
    public double somarAreas( figuraGeometrica quadrado, figuraGeometrica circulo){
        double totalA = quadrado.calcularArea() + circulo.calcularArea();
        return totalA;
    }
}
