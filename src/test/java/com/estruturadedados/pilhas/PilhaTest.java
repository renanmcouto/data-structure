package com.estruturadedados.pilhas;

import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {

    @Test
    public void testInserir(){
        Pilha pilha = new Pilha();
        pilha.inserir("kakaroto");
        pilha.inserir("Vegeta");
        System.out.println(pilha);
    }

    @Test
    public void testRetirada(){
        Pilha pilha = new Pilha();
        pilha.inserir("kakaroto");
        pilha.inserir("Vegeta");
        pilha.remove();
        assertEquals("Tamanho seja 1",Integer.valueOf(1),pilha.tamanhoPilha());
    }

    @Test
    public void testVazia(){
        Pilha pilha = new Pilha();
        pilha.inserir("kakaroto");
        pilha.inserir("Vegeta");
        assertFalse(pilha.vazia());
    }

}