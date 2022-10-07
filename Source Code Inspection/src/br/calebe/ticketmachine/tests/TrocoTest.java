package br.calebe.ticketmachine.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class TrocoTest {
    @Test
    public void TestTrocoSucesso(){
        valor_troco = Troco.Troco(187)
        assertEquals(valor_troco, [PapelMoeda(2, 1),PapelMoeda(5, 1),PapelMoeda(10, 1),PapelMoeda(20, 1),PapelMoeda(50, 1),PapelMoeda(100, 1)]);
    }

    @Test(expected = TrocoException.class)
    public void TestTrocoErro(){
        valor_troco = Troco.Troco(-52)        
    }
    
    @Test
    public void TestTrocoErro(){
        valor_troco = Troco.Troco(187)
        assertEquals(valor_troco, [PapelMoeda(2, 5),PapelMoeda(5, 2),PapelMoeda(10, 7),PapelMoeda(20, 4),PapelMoeda(50, 3),PapelMoeda(100, 9)]);
    }
}
