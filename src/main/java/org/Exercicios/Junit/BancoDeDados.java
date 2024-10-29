package org.Exercicios.Junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //Fez algo
        LOGGER.info("Iniciou Conexão");
    }

    public static void finalizarConexao() {
        //Fez algo
        LOGGER.info("Finalizou Conexão");
    }

    public static void inserirDados(Pessoa pessoa) {
        //Insere pessoa no BD
        LOGGER.info("Inseriu Dados");
    }

    public static void removerDados(Pessoa pessoa) {
        //Insere pessoa no BD
        LOGGER.info("Removeu Dados");
    }
}
