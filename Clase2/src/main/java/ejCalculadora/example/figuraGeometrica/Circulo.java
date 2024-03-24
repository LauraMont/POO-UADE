package ejCalculadora.example.figuraGeometrica;

public class Circulo extends FiguraGeometrica{
    double radio;
    public Circulo(double rad){
        radio = rad;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
