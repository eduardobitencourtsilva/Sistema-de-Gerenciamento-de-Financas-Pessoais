/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import com.mycompany.sgfp.DespesasNotificacao;
import com.mycompany.sgfp.persistencia.Despesa;
import com.mycompany.sgfp.persistencia.DespesaInfo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteDespesasNotificacao {
    private DespesasNotificacao noti = new DespesasNotificacao();
    private Despesa despesa = new Despesa(0, new DespesaInfo("teste de nome", "teste de tipo", "teste de categoria", "teste de status"));
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        despesa.setId(0);
        noti.setDespesa(despesa);
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testaNotificacaoExiste() {
        assertNotNull("Notificação não é nula", noti);
    }
    
    @Test
    public void testaNotificacaoRun() {
        assertEquals("Você tem a conta teste de nome de id 0 para pagar!", noti.getMensagem());
    }
}