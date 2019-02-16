import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void calculate(){
        int esperado = 5;
        Calculator calcu = new Calculator();

        assertEquals(esperado, calcu.calculate(2,3,"+"));
    }

}