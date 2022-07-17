package junit;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20, 30, 40, 50};
        int[] segundoLancamento = {10,20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Jessica", LocalDateTime.of(2000, 1,1,15,0,0));

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        int outroValor = 5;

        assertEquals(valor, outroValor);
    }
}
