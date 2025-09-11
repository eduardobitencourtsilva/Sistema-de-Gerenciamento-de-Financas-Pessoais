/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */

import com.mycompany.sgfp.DespesasLista;
import com.mycompany.sgfp.persistencia.Despesa;
import com.mycompany.sgfp.persistencia.DespesaInfo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteDespesasLista {
    private List<Despesa> lista;
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        lista = DespesasLista.listar();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testaListaExiste() {
        assertNotNull("Lista não é nula", lista);
    }
    
    @Test
    public void testaListaAdicionar() {
        Despesa despesa = new Despesa(0, new DespesaInfo("nome", "tipo", "categoria", "status"));
        despesa.setId(0);
        DespesasLista.adicionar(despesa);
        
        assertEquals(lista.isEmpty(), false);
        
        DespesasLista.remover(despesa);
    }
    
    @Test
    public void testaListaRemover() {
        Despesa despesa = new Despesa(0, new DespesaInfo("nome", "tipo", "categoria", "status"));
        despesa.setId(0);
        DespesasLista.adicionar(despesa);
        
        DespesasLista.remover(despesa);
        
        assertEquals(lista.isEmpty(), true);
    }

}