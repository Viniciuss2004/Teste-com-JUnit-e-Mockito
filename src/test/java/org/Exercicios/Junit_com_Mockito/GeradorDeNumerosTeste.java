package org.Exercicios.Junit_com_Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {

    @Test
    void testaGeracaoComTamnhoDefinido() {

        MockedStatic<GeradorDeNumeros> mockedStatic = Mockito.mockStatic(GeradorDeNumeros.class);
    }
}
