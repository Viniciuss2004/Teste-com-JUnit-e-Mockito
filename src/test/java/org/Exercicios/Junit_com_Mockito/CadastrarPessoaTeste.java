package org.Exercicios.Junit_com_Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void cadastrarPessoa() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SC","Florianópolis", "Rua", "casa 6", "Ratones");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Vinicius", " 123456", LocalDate.now(), "54321");

        assertNull(pessoa.getEndereco());
    }

    @Test
    void lancarExecptionQuandoChamarApiDosCorreios() {

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);

        Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Vinicius", "123456", LocalDate.now(), "54321"));
    }
}
