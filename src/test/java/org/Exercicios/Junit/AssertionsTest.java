package org.Exercicios.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class AssertionsTest {

    @Test
    void validarLancamentos() {

        // Aqui dará certo pois os 2 Arrays estão iguais.
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);

        //Aqui dará certo também pois a Assertions foi alterada para "assertNotEquals".
        int[] primeiroLancamento1 = {10, 20, 30, 40, 50};
        int[] segundoLancamento2 = {-3, 27, 43, 10, 32};

        assertNotEquals(primeiroLancamento1, segundoLancamento2);
    }

    @Test
    void validarSeObjetoEstaNulo() {

        //Aqui dará certo pois o objeto está VAZIO
        Pessoa pessoa = null;
        assertNull(pessoa);

        //Aqui dará certo pois agora é NotNull e o objeto tem parametros
        pessoa = new Pessoa("Vinicius", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        //Aqui dará certo pois as duas variaveis estão com o mesmo valor e o comando é assertEquals
        double valor = 5.0;
        double outrovalor = 5.0;

        assertEquals(valor, outrovalor);

        //Aqui dará certo pois as duas variaveis estão com valores diferente mas o comando é assertNotEquals
        double valor1 = 5.0;
        double outrovalor2 = 8.0;

        assertNotEquals(valor1, outrovalor2);

    }
}
