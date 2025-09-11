package com.mycompany.sgfp;

import com.mycompany.sgfp.persistencia.Despesa;
import javax.swing.JOptionPane;

public class DespesasNotificacao implements Runnable {
    private Despesa despesa;

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Você tem a conta " + despesa.getInfo().getNome() + " de id " + despesa.getId() + " para pagar!"); 
    }
}