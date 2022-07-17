package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1,1,15,0,0));
    Pessoa joao = new Pessoa("João", LocalDateTime.of(2020, 1,1,15,0,0));


    @Test
    void deveCalcularIdadeCorretamente(){
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
