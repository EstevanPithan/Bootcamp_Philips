package junit;

import java.util.logging.Logger;

public class BancoDeDados {
    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //Insere essa pessa no banco de dados
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //Insere essa pessa no banco de dados
        LOGGER.info("Removeu dados");
    }
}

