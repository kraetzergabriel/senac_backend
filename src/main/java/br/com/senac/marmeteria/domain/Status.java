package br.com.senac.marmeteria.domain;

public enum Status {
    AGUARDANDO(1), EM_PREPARO(2), PRONTO(3);

    private Integer status;

    Status(Integer i){
        this.status = i;
    }
}
