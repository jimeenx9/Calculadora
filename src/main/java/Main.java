import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Ingrese el número de la operación: ");
        
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = 0;
        try {
            switch (opcion) {
                case 1:
                    resultado = calculadora.sumando(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.restar(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
