package builder;

import java.util.Date;

public class OrdemServico {

    private int numeroOS;
    private String descricaoProblema;
    private Date dataAbertura;
    private String equipamentoId;
    private String mecanicoResponsavel;
    private String tipoManutencao; // Preventiva, Corretiva, Preditiva
    private String prioridade;
    private String kmFerrovia; // Localização na malha
    private String patioRecolhimento;
    private String pecasSolicitadas;
    private String centroCusto;
    private String status;
    private Date dataConclusao;

    public OrdemServico() {
        this.numeroOS = 0;
        this.descricaoProblema = "";
    }

    public int getNumeroOS() { return numeroOS; }
    public void setNumeroOS(int numeroOS) { this.numeroOS = numeroOS; }

    public String getDescricaoProblema() { return descricaoProblema; }
    public void setDescricaoProblema(String descricaoProblema) { this.descricaoProblema = descricaoProblema; }

    public Date getDataAbertura() { return dataAbertura; }
    public void setDataAbertura(Date dataAbertura) { this.dataAbertura = dataAbertura; }

    public String getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(String equipamentoId) { this.equipamentoId = equipamentoId; }

    public String getMecanicoResponsavel() { return mecanicoResponsavel; }
    public void setMecanicoResponsavel(String mecanicoResponsavel) { this.mecanicoResponsavel = mecanicoResponsavel; }

    public String getTipoManutencao() { return tipoManutencao; }
    public void setTipoManutencao(String tipoManutencao) { this.tipoManutencao = tipoManutencao; }

    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

    public String getKmFerrovia() { return kmFerrovia; }
    public void setKmFerrovia(String kmFerrovia) { this.kmFerrovia = kmFerrovia; }

    public String getPatioRecolhimento() { return patioRecolhimento; }
    public void setPatioRecolhimento(String patioRecolhimento) { this.patioRecolhimento = patioRecolhimento; }

    public String getPecasSolicitadas() { return pecasSolicitadas; }
    public void setPecasSolicitadas(String pecasSolicitadas) { this.pecasSolicitadas = pecasSolicitadas; }

    public String getCentroCusto() { return centroCusto; }
    public void setCentroCusto(String centroCusto) { this.centroCusto = centroCusto; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getDataConclusao() { return dataConclusao; }
    public void setDataConclusao(Date dataConclusao) { this.dataConclusao = dataConclusao; }
}