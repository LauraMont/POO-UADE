package ejCalculadora.example;
import ejCalculadora.example.calculadora.Calculadora;
import ejCalculadora.example.calculadora.CalculadoraAvanzada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculadoraAvanzada miCalculadoraAvanzada = new CalculadoraAvanzada();

        System.out.println("Ejercicio 1 ");
        double resultadoSuma = Calculadora.sumar(5,3);
        System.out.println("Suma:"+resultadoSuma);
        double resultadoResta=Calculadora.restar(5,3);
        System.out.println("Resta:"+resultadoResta);
        double resultadoMultiplicacion=Calculadora.multiplicar(5,3);
        System.out.println("Multiplicación:"+resultadoMultiplicacion);
        double resultadoDivision=Calculadora.dividir(6,3);
        System.out.println("División:"+resultadoDivision);

        System.out.println("Ejercicio 2 ");
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
    }
}