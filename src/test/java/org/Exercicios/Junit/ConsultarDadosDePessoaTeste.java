package org.Exercicios.Junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosparaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Vinicius", LocalDate.of(2004,8,24)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removerDados(new Pessoa("Vinicius", LocalDate.of(2004,8,24)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }
}
