package builder;

import java.util.Date;

public class OrdemServicoBuilder {

    private final OrdemServico ordemServico;

    public OrdemServicoBuilder() {
        ordemServico = new OrdemServico();
    }


    public OrdemServico build() {
        if (ordemServico.getNumeroOS() == 0) {
            throw new IllegalArgumentException("Número da OS inválido");
        }
        if (ordemServico.getDescricaoProblema().isEmpty()) {
            throw new IllegalArgumentException("Descrição do problema inválida");
        }
        return ordemServico;
    }

    // Métodos fluentes (retornam a própria instância do builder)
    public OrdemServicoBuilder setNumeroOS(int numeroOS) {
        ordemServico.setNumeroOS(numeroOS);
        return this;
    }

    public OrdemServicoBuilder setDescricaoProblema(String descricaoProblema) {
        ordemServico.setDescricaoProblema(descricaoProblema);
        return this;
    }

    public OrdemServicoBuilder setDataAbertura(Date dataAbertura) {
        ordemServico.setDataAbertura(dataAbertura);
        return this;
    }

    public OrdemServicoBuilder setEquipamentoId(String equipamentoId) {
        ordemServico.setEquipamentoId(equipamentoId);
        return this;
    }

    public OrdemServicoBuilder setMecanicoResponsavel(String mecanicoResponsavel) {
        ordemServico.setMecanicoResponsavel(mecanicoResponsavel);
        return this;
    }

    public OrdemServicoBuilder setTipoManutencao(String tipoManutencao) {
        ordemServico.setTipoManutencao(tipoManutencao);
        return this;
    }

    public OrdemServicoBuilder setPrioridade(String prioridade) {
        ordemServico.setPrioridade(prioridade);
        return this;
    }

    public OrdemServicoBuilder setKmFerrovia(String kmFerrovia) {
        ordemServico.setKmFerrovia(kmFerrovia);
        return this;
    }

    public OrdemServicoBuilder setPatioRecolhimento(String patioRecolhimento) {
        ordemServico.setPatioRecolhimento(patioRecolhimento);
        return this;
    }

    public OrdemServicoBuilder setPecasSolicitadas(String pecasSolicitadas) {
        ordemServico.setPecasSolicitadas(pecasSolicitadas);
        return this;
    }

    public OrdemServicoBuilder setCentroCusto(String centroCusto) {
        ordemServico.setCentroCusto(centroCusto);
        return this;
    }

    public OrdemServicoBuilder setStatus(String status) {
        ordemServico.setStatus(status);
        return this;
    }

    public OrdemServicoBuilder setDataConclusao(Date dataConclusao) {
        ordemServico.setDataConclusao(dataConclusao);
        return this;
    }
}