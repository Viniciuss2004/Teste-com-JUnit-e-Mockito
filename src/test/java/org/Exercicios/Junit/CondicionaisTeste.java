package org.Exercicios.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    //Nesse exemplo a condição é o usuario, caso a condição for verdadeira dará certo
    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "viand")
    void validarAlgoSomenteNoUsuarioVinicius() {
        Assertions.assertEquals(10, 5 + 5);
    }

    //Nesse exemplo a condição é o sistema operacional, caso a condição for verdadeira dará certo
    @Test
    @EnabledOnOs(OS.WINDOWS) // Apenas um Sistema Operacional
    void validarAlgoSomenteNoSistemaWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }

    //Nesse exemplo a condição é a versão do java, caso a condição for verdadeira dará certo
    @Test
    @EnabledOnJre(JRE.JAVA_17) //Apenas uma versão
     void validarAlgoSomenteNaVersaoDoJava17() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
