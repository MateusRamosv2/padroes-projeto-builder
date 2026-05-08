package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoBuilderTest {

    @Test
    void deveRetornarExcecaoParaOrdemServicoSemNumero() {
        try {
            OrdemServicoBuilder builder = new OrdemServicoBuilder();
            OrdemServico os = builder
                    .setDescricaoProblema("Falha na locomotiva")
                    .setEquipamentoId("LOC-9080")
                    .build();
            fail(); // Se chegar aqui, o teste falha, pois a exceção não ocorreu
        } catch (IllegalArgumentException e) {
            assertEquals("Número da OS inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOrdemServicoSemDescricao() {
        try {
            OrdemServicoBuilder builder = new OrdemServicoBuilder();
            OrdemServico os = builder
                    .setNumeroOS(45012)
                    .setEquipamentoId("LOC-9080")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Descrição do problema inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarOrdemServicoValida() {
        OrdemServicoBuilder builder = new OrdemServicoBuilder();
        OrdemServico os = builder
                .setNumeroOS(45012)
                .setDescricaoProblema("Falha na locomotiva")
                .setEquipamentoId("LOC-9080")
                .setTipoManutencao("Corretiva")
                .setKmFerrovia("KM-1240")
                .build();

        assertNotNull(os);
        assertEquals(45012, os.getNumeroOS());
        assertEquals("Falha na locomotiva", os.getDescricaoProblema());
    }
}