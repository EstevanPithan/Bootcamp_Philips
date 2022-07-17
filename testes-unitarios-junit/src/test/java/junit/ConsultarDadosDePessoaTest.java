package junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static junit.BancoDeDados.LOGGER;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Jessica", LocalDateTime.of(2000, 1,1,15,0,0)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Jessica", LocalDateTime.of(2000, 1,1,15,0,0)));
    }

    @Test
     void validarDadosDeRetorno() {
        System.out.println("Entrou no validar Dados de Retorno");
        Assertions.assertTrue(true);
    }




    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou o finalizar conexao");
    }

}
