package com.mycompany.sgfp.util;

import com.mycompany.sgfp.DespesasLista;
import com.mycompany.sgfp.persistencia.Despesa;
import com.mycompany.sgfp.persistencia.DespesaDAO;
import com.mycompany.sgfp.persistencia.DespesaInfo;

public class CadastroDespesa {
    public static void cadastrarDespesa(String nome, double valor, String tipo, String categoria, String status) {
        Despesa d = new Despesa(valor, new DespesaInfo(nome, tipo, categoria, status));  
        DespesaDAO dao = new DespesaDAO();
        
        dao.cadastrar(d);
        
        DespesasLista.atualizar();
    }
}