package ejCalculadora.example;
import ejCalculadora.example.calculadora.Calculadora;
import ejCalculadora.example.calculadora.CalculadoraAvanzada;
import ejCalculadora.example.figuraGeometrica.Circulo;
import ejCalculadora.example.figuraGeometrica.Cuadrado;
import ejCalculadora.example.figuraGeometrica.Triangulo;
import ejCalculadora.example.figuraGeometrica.FiguraGeometrica;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculadoraAvanzada miCalculadoraAvanzada = new CalculadoraAvanzada();

        System.out.println("\nEjercicio 1 ");
        double resultadoSuma = Calculadora.sumar(5,3);
        System.out.println("Suma:"+resultadoSuma);
        double resultadoResta=Calculadora.restar(5,3);
        System.out.println("Resta:"+resultadoResta);
        double resultadoMultiplicacion=Calculadora.multiplicar(5,3);
        System.out.println("Multiplicación:"+resultadoMultiplicacion);
        double resultadoDivision=Calculadora.dividir(6,3);
        System.out.println("División:"+resultadoDivision);

        System.out.println("\nEjercicio 2 ");
        resultadoSuma = miCalculadoraAvanzada.sumar(5,3);
        System.out.println("SumaAvanzada:"+resultadoSuma);
        resultadoResta = miCalculadoraAvanzada.restar(5,3);
        System.out.println("RestaAvanzada:"+resultadoResta);
        resultadoMultiplicacion = miCalculadoraAvanzada.multiplicar(5,3);System.out.println("MultiplicaciónAvanzada:"+resultadoMultiplicacion);
        resultadoDivision = miCalculadoraAvanzada.dividir(6,3);
        System.out.println("DivisiónAvanzada:"+resultadoDivision);
        double resultadoModulo = miCalculadoraAvanzada.modulo(7,3);
        System.out.println("MóduloAvanzada:"+resultadoModulo);
        double resultadoRaiz = miCalculadoraAvanzada.raizCuadrada(9);
        System.out.println("RaízcuadradaAvanzada:"+resultadoRaiz);
        double resultadoPotencia = miCalculadoraAvanzada.potencia(2,3);
        System.out.println("PotenciaAvanzada:"+resultadoPotencia);
        /////////////////////////////////////////////////////////////
        Calculadora miCalculadoraSimple = new Calculadora();
        resultadoSuma=miCalculadoraSimple.sumar(5,3);
        System.out.println("SumaSimple:"+resultadoSuma);
        resultadoResta=miCalculadoraSimple.restar(5,3);
        System.out.println("RestaSimple:"+resultadoResta);
        resultadoMultiplicacion=miCalculadoraSimple.multiplicar(5,3);
        System.out.println("MultiplicaciónSimple:"+resultadoMultiplicacion);
        resultadoDivision=miCalculadoraSimple.dividir(6,3);
        System.out.println("DivisiónSimple:"+resultadoDivision);

        System.out.println("\nEjercicio 3 ");
        List<FiguraGeometrica> figuras =  new ArrayList<FiguraGeometrica>();
        Circulo figura1 = new Circulo(4);
        Cuadrado figura2 = new Cuadrado(5);
        Triangulo figura3 = new Triangulo(3);
        figuras.add(figura1);
        figuras.add(figura2);
        figuras.add(figura3);
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.area());
        }
    }
}