package br.calebe.ticketmachine.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

public class TicketMachineTest {
    
    @Test
    public void testTicketMachineSaldoZerado(){
        TicketMachine ticketMachine = new TicketMachine(0);
        assertEquals(ticketMachine.getSaldo(), 0);
    }

    @Test
    public void testInserirSucesso(){
        TicketMachine ticketMachine = new TicketMachine(0);
        ticketMachine.inserir(100);
        ticketMachine.inserir(100);
        ticketMachine.inserir(100);
        assertEquals(ticketMachine.getSaldo(), 300);
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testInserirErro(){
        TicketMachine ticketMachine = new TicketMachine(0);
        ticketMachine.inserir(1000);
    }

    @Test
    public void testGetTroco(){
        TicketMachine ticketMachine = new TicketMachine(0);
        ticketMachine.inserir(100);
        assertEquals(ticketMachine.getTroco(), 100);
    }

    @Test
    public void testImprimir(){
        TicketMachine ticketMachine = new TicketMachine(0);
        ticketMachine.inserir(100);
        assertEquals(ticketMachine.imprimir(), "R$ 100,00")
    }

}
