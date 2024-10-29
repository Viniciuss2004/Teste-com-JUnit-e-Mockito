package org.Exercicios.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExepctionsTeste {

    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta ("12345", 10);
        Conta contaDestino = new Conta ("54321", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //Espera uma Execeção
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino,-1);
        });

        //não espera uma Execeção
        Assertions.assertDoesNotThrow(() -> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino,1);
        });
    }
}
