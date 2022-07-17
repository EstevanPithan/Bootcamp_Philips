package junit;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @Order(3)
    @Test
    void validaLFluxoA() {
        Assertions.assertTrue(true);
    }
    @Order(4)
    @Test
    void validaLFluxoB() {
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validaLFluxoC() {
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validaLFluxoD() {
        Assertions.assertTrue(true);
    }
}
