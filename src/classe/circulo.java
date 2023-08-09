package classe;

public class circulo implements figuraGeometrica {
    
    //Atributos

    private double raio;

    //construtor
    public circulo(double raio){
        this.raio = raio;
    }

    //Metodos especificos

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    /*/
    public double calcularArea(){
        //area = PI * raio ^2
        return Math.PI * Math.pow(raio, 2);
    }

    */

    //metodos getters and setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



}
