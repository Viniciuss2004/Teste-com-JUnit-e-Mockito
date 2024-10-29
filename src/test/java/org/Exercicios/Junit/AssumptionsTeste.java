package org.Exercicios.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioVinicius() {

        //O teste só falhará caso o nome do usuario não for o mesmo do sistema
        Assumptions.assumeTrue("viand".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
