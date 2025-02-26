public class Calculadora {

    // Método sumar
    /**
     * Suma dos números.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return La suma de los dos números.
     */
    public static int sumando(int num1, int num2) {
        return num1 + num2;
    }

    // Método restar
    /**
     * Resta dos números.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return La resta de num1 y num2.
     */
    public int restar(int num1, int num2) {
        System.out.println("Realizando resta...");
        return num1 - num2;
    }

    // Método multiplicar
    /**
     * Multiplica dos números.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return El resultado de multiplicar num1 por num2.
     */
    public int multiplicar(int num1, int num2) {
        System.out.println("Realizando multiplicación...");
        return num1 * num2;
    }

    // Método dividir
    /**
     * Divide dos números.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return El resultado de dividir num1 entre num2.
     * @throws ArithmeticException Si num2 es 0, se lanza una excepción.
     */
    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: División por cero. Lanzando excepción...");
            throw new ArithmeticException();
        }
        System.out.println("Realizando división...");
        return num1 / num2;
    }

    // Método calculadora
    /**
     * Realiza una operación aritmética entre dos números.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @param operacion El operador a realizar ('+', '-', '*', '/').
     * @return El resultado de la operación.
     * @throws IllegalArgumentException Si el operador no es válido.
     */
    public int calculadora(int num1, int num2, char operacion) {
        switch (operacion) {
            case '+':
                return sumando(num1, num2);
            case '-':
                return restar(num1, num2);
            case '*':
                return multiplicar(num1, num2);
            case '/':
                return dividir(num1, num2);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }

    // Método que usa la clase Estadistica
    /**
     * Llama al método media de la clase Estadistica.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return La media de num1 y num2.
     */
    public double calcularMedia(double num1, double num2) {
        Estadistica estadistica = new Estadistica();
        return estadistica.media(num1, num2);
    }

    // Método que usa la clase Estadistica
    /**
     * Llama al método potencia de la clase Estadistica.
     *
     * @param base La base de la potencia.
     * @param exponente El exponente al que se elevará la base.
     * @return El resultado de base^exponente.
     */
    public double calcularPotencia(double base, int exponente) {
        Estadistica estadistica = new Estadistica();
        return estadistica.potencia(base, exponente);
    }
}
