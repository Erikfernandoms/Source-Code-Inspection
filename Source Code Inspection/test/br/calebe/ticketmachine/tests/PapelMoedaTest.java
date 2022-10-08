package br.calebe.ticketmachine.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.PapelMoeda;
public class PapelMoedaTest {
    
    @Test
    public void testPapelMoedaZerado(){
        PapelMoeda papelMoeda = new PapelMoeda(0, 1);
        assertEquals(papelMoeda.getValor(), 0);
    }

    @Test
    public void testPapelMoedaQuantidadeIguala5(){
        PapelMoeda papelMoeda = new PapelMoeda(0, 5);
        assertEquals(papelMoeda.getQuantidade(), 5);
    }

    @Test
    public void testPapelMoedaValorDiferentedeZero(){
        PapelMoeda papelMoeda = new PapelMoeda(150, 5);
        assertEquals(papelMoeda.getValor(), 150);
    }
}
