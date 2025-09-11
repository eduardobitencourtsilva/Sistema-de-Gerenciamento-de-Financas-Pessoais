package com.mycompany.sgfp.persistencia;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="despesas")
public class Despesa {
    @Id
    private int id;
    private double valor;
    
    @Embedded
    private DespesaInfo info;

    public Despesa() {
    }

    public Despesa(double valor, DespesaInfo info) {
        this.valor = valor;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public DespesaInfo getInfo() {
        return info;
    }

    public void setInfo(DespesaInfo info) {
        this.info = info;
    }
}