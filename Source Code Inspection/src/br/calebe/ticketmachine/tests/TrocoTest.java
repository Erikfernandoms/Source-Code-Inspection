package br.calebe.ticketmachine.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

import br.calebe.ticketmachine.core.Troco;
import br.calebe.ticketmachine.core.PapelMoeda;

public class TrocoTest {
    @Test
    public void TestTrocoSucesso(){
        Troco troco = new Troco(187);
        assertEquals(troco.getTroco(), 187);
    }

    @Test(expected = TrocoException.class)
    public void TestTrocoErro(){
        Troco troco = new Troco(-52);   
    }
 
    @Test
    public void TestTrocoErro(){
        Troco troco = new Troco(187);
        assertNotEquals(troco.getTroco(), 180);
    }
}
