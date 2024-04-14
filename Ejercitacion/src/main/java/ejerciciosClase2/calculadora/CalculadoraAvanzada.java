package ejerciciosClase2.calculadora;

public class CalculadoraAvanzada extends Calculadora{
    public double modulo(double nro1, double nro2){
        return nro1%nro2;
    }
    public double raizCuadrada(double nro1){
        return Math.sqrt(nro1);
    }
    public double potencia(double nro1, double nro2){
        return Math.pow(nro1,nro2);
    }

}
