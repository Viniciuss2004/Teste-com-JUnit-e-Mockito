package org.Exercicios.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarIdade() {
        Pessoa vinicius = new Pessoa("Vinicius", LocalDate.of(2004, 8, 24));
        Assertions.assertEquals(20, vinicius.getIdade());
    }

    @Test
    void validarNome() {
        Pessoa vinicius = new Pessoa("Vinicius", LocalDate.of(2004, 8, 24));
        Assertions.assertEquals("Vinicius", vinicius.getNome());
    }

    @Test
    void validarSeEhMaiorDeIdade() {
        Pessoa vinicius = new Pessoa("Vinicius", LocalDate.of(2004, 8, 24));
        Assertions.assertTrue(vinicius.ehMaiorDeIdade());

        Pessoa lara = new Pessoa("Lara", LocalDate.now());
        Assertions.assertFalse(lara.ehMaiorDeIdade());
    }
}
