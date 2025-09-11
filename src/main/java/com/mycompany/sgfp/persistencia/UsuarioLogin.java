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
public class UsuarioLogin {
    private String usuario;
    private String senha;

    public UsuarioLogin() {
    }

    public UsuarioLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}