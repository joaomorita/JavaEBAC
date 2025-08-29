package br.com.morita.testes;

import br.com.morita.ListaMulheres;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class VerificaListaDeMulheresTest {

    @Test
    public void listaDeMulheres() {
        List<String> listaDePessoas = List.of("João-Homem", "Maria-mulher", "Carla-mulher",
                "Carlos-homem", "Renata-feminino");

        // Chama o método para filtrar a lista
        List<String> mulheres = ListaMulheres.filtraMulheres(listaDePessoas);

        // Verifica se as mulheres estão na lista
        assertTrue(mulheres.contains("Maria"));
        assertTrue(mulheres.contains("Renata"));
        assertTrue(mulheres.contains("Carla"));

        // Verifica se os homens estão fora da lista
        assertFalse(mulheres.contains("João"));
        assertFalse(mulheres.contains("Carlos"));

        // Verifica se o tamanho da lista é 3
        assertEquals(3, mulheres.size());
    }

}