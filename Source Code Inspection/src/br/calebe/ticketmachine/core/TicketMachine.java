package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import br.calebe.ticketmachine.exception.TrocoException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException('Não encontrei esse papelmoeda');
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() throws TrocoException{
        if (this.saldo > this.valor){
            return this.saldo - this.valor;
        }
        else{
           throw new TrocoException("Você não possui troco");
        }
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (this.saldo < this.valor) {
            throw new SaldoInsuficienteException('Saldo insuficiente');
        }
        String result = this.valor;
        return result;
    }
}

inserir(5)