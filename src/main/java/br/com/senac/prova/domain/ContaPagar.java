package br.com.senac.prova.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class ContaPagar {

    @Id
    private Integer codigo;

    @NotNull
    private LocalDate dataEmissao;

    @NotNull
    private LocalDate dataVencimento;
    private Double valor;
    private LocalDate dataPagamento;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tipodespesa_id")
    private TipoDespesa tipoDespesa;

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
}

