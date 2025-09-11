package com.mycompany.sgfp;

import com.mycompany.sgfp.persistencia.Despesa;
import com.mycompany.sgfp.persistencia.DespesaDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DespesasLista {
    private static List<Despesa> lista = new ArrayList();
    
    public static List<Despesa> listar() {
        return lista;
    }
    
    public static void atualizar() { 
        DespesaDAO dao = new DespesaDAO();
        lista = dao.consultar();
    }
    
    public static void adicionar(Despesa d) { 
        lista.add(d);
    }
    
    public static void remover(Despesa d) { 
        lista.remove(d);
    }
    
    public static void organizar() {
        Collections.sort(lista, new DespesasComparator());
    }
}