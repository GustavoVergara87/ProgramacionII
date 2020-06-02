package modelo;

/**
 * @author Gustavo
 */
public class Modelo {

    public boolean ValidarDato(String numero) {
        try {
            Double tmp = Double.parseDouble(numero);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public double opSuma(double a, double b) {
        return a + b;
    }

    public double opResta(double a, double b) {
        return a - b;
    }

    public double opMultiplicacion(double a, double b) {
        return a * b;
    }

    public double opDivision(double a, double b) {
        if (b == 0) {
            if (a < 0) {
                return Double.NEGATIVE_INFINITY;
            } else {
                return Double.POSITIVE_INFINITY;
            }
        } else {
            return a / b;
        }
    }

}
