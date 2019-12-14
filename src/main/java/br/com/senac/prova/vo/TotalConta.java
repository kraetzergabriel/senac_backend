package br.com.senac.prova.vo;

public class TotalConta {

    private String despesa;
    private Double total;

    public TotalConta(String despesa, Double total){
        this.total = total;
        this.despesa = despesa;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setDespesa(String despesa) {
        this.despesa = despesa;
    }

    public Double getTotal() {
        return total;
    }

    public String getDespesa() {
        return despesa;
    }

}
