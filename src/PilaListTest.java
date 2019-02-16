import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilaListTest {
    @Test
    void push(){
        String esperado = null;
        PilaList<String> lista = new PilaList<String>(1);
        assertEquals(esperado, lista.peek());
    }

    @Test
    void empty(){
        Boolean esperado = true;
        PilaList<String> lista = new PilaList<String>(2);
        assertEquals(esperado, lista.empty());
    }

}