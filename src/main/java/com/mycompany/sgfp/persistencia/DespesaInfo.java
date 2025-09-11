/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sgfp.persistencia;

import jakarta.persistence.Embeddable;

/**
 *
 * @author eduardo
 */
@Embeddable
public class DespesaInfo {
    private String nome;
    private String tipo;
    private String categoria;
    private String status;

    public DespesaInfo() {
    }

    public DespesaInfo(String nome, String tipo, String categoria, String status) {
        this.nome = nome;
        this.tipo = tipo;
        this.categoria = categoria;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}