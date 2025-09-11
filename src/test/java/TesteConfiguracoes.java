
import com.mycompany.sgfp.DespesasLista;
import com.mycompany.sgfp.DespesasNotificacao;
import com.mycompany.sgfp.persistencia.Despesa;
import com.mycompany.sgfp.persistencia.DespesaInfo;
import com.mycompany.sgfp.util.Configuracoes;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class TesteConfiguracoes {
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testaConfigurar() {
        Despesa despesa = new Despesa(0, new DespesaInfo("teste de nome", "teste de tipo", "teste de categoria", "teste de status"));
        despesa.setId(0);
        
        DespesasLista.adicionar(despesa);
        
        Configuracoes.configurar(0, "categoria de teste");
        
        assertEquals("categoria de teste", despesa.getInfo().getCategoria());
        
        DespesasLista.remover(despesa);
    }
}