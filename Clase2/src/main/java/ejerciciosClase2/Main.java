package ejerciciosClase2;
import ejerciciosClase2.calculadora.Calculadora;
import ejerciciosClase2.calculadora.CalculadoraAvanzada;
import ejerciciosClase2.figuraGeometrica.Circulo;
import ejerciciosClase2.figuraGeometrica.Cuadrado;
import ejerciciosClase2.figuraGeometrica.Triangulo;
import ejerciciosClase2.figuraGeometrica.FiguraGeometrica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        //Se inicializa lista vacia de figuras
        List<FiguraGeometrica> figuras =  new ArrayList<FiguraGeometrica>();
        //Se inicializa por separado cada figura
        Circulo figura1 = new Circulo(4);
        Cuadrado figura2 = new Cuadrado(5);
        Triangulo figura3 = new Triangulo(3);
        //Se agrega todas las figuras a la lista
        Collections.addAll(figuras, figura1,figura2,figura3);
        //Se imprime por consola el area de cada figura
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.area());
        }
    }
}