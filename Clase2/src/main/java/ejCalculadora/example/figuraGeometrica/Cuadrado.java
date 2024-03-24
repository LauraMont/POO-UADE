package ejCalculadora.example.figuraGeometrica;

public class Cuadrado extends FiguraGeometrica{
    double lado;
    public Cuadrado(double ladoAux){
        lado = ladoAux;
    }
    @Override
    public double area() {
        return lado*lado;
    }
}
