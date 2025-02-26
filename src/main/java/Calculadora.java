public class Calculadora {

    // Método sumar
    public int sumar(int a, int b) {
        System.out.println("Realizando suma...");
        return a + b;
    }

    // Método restar
    public int restar(int a, int b) {
        System.out.println("Realizando resta...");
        return a - b;
    }

    // Método multiplicar
    public int multiplicar(int a, int b) {
        System.out.println("Realizando multiplicación...");
        return a * b;
    }

    // Método dividir
    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero. Lanzando excepción...");
            throw new ArithmeticException();
        }
        System.out.println("Realizando división...");
        return a / b;
    }

    // Método calculadora
    public int calculadora(int a, int b, char operacion) {
        switch (operacion) {
            case '+':
                return sumar(a, b);
            case '-':
                return restar(a, b);
            case '*':
                return multiplicar(a, b);
            case '/':
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }

        /**
     * Calcula la potencia de un número.
     *
     * @param base La base de la potencia.
     * @param exponente El exponente al que se elevará la base.
     * @return El resultado de base^exponente.
     */
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }


    
}
