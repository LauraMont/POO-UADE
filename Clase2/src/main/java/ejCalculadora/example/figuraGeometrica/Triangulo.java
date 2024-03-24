package ejCalculadora.example.figuraGeometrica;

public class Triangulo extends FiguraGeometrica{
    double lado;
    public Triangulo(double ladoAux){
        lado = ladoAux;
    }
    @Override
    public double area() {
        return lado*lado*(Math.sqrt(3)/4);
    }
    //A = ½ (b × h)
}
