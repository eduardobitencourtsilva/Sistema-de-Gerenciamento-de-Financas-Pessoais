package com.mycompany.sgfp.persistencia;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String tipo;
    
    @Embedded
    private UsuarioLogin login;

    public Usuario() {
    }

    public Usuario(String tipo, UsuarioLogin login) {
        this.tipo = tipo;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public UsuarioLogin getLogin() {
        return login;
    }

    public void setLogin(UsuarioLogin login) {
        this.login = login;
    }      
}