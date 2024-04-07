package ejercicioJdoc;

/**
 * Clase que representa una calculadora simple.
 */
public class Calculadora {

    /**
     * Suma dos números.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la suma.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la resta.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la multiplicación.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números.
     *
     * @param a Numerador.
     * @param b Denominador (no debe ser cero).
     * @return Resultado de la división.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        return a / b;
    }
}
