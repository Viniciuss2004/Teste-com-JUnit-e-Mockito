package org.Exercicios.Junit;

import org.junit.jupiter.api.*;

 @TestMethodOrder(MethodOrderer.MethodName.class) //Por ordem alfabética
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Por ordem que eu escolher @Order(...)
// @TestMethodOrder(MethodOrderer.Random.class) //Por ordem aleatória
// @TestMethodOrder(MethodOrderer.DisplayName.class) //Por ordem que eu escolher @DisplayName("...")

public class EscolhendoAOrdemTeste {

    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);

    }

    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);

    }

    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);

    }
}
