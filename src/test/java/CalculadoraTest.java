import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private static Calculadora calculadora;

    @BeforeAll
    static void setUpBeforeClass() {
        calculadora = new Calculadora();
        System.out.println("---Inicio de las pruebas---");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("---Final de las pruebas---");
    }

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(-2, 1));
        assertEquals(0, calculadora.sumar(0, 0));
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertEquals(-3, calculadora.restar(-2, 1));
        assertEquals(0, calculadora.restar(5, 5));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-2, calculadora.multiplicar(-2, 1));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-3, calculadora.dividir(-9, 3));
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }

    @Test
    void testCalculadora() {
        assertEquals(5, calculadora.calculadora(2, 3, '+'));
        assertEquals(1, calculadora.calculadora(3, 2, '-'));
        assertEquals(6, calculadora.calculadora(2, 3, '*'));
        assertEquals(2, calculadora.calculadora(6, 3, '/'));
        assertThrows(ArithmeticException.class, () -> calculadora.calculadora(5, 0, '/'));
        assertThrows(IllegalArgumentException.class, () -> calculadora.calculadora(2, 3, 'x'));
    }
}
