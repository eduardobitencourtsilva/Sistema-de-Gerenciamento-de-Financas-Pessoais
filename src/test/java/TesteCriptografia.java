
import com.mycompany.sgfp.DespesasNotificacao;
import com.mycompany.sgfp.persistencia.Despesa;
import com.mycompany.sgfp.persistencia.DespesaInfo;
import com.mycompany.sgfp.util.Criptografia;
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
public class TesteCriptografia {
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
    public void testaMD5() {
        String criptografado = Criptografia.getMD5("Hello world!");
        assertEquals("86fb269d190d2c85f6e0468ceca42a20", criptografado);
    }
}