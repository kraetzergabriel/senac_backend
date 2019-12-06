package br.com.senac.marmeteria.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Double total;
    private Status status;

    public Integer getId() {
        return id;
    }

    public Double getTotal() {
        return total;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
