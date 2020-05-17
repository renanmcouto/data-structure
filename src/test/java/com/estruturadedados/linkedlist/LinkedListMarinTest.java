package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.assertEquals;

class LinkedListMarinTest {

    @Test
    public void TesteCriacaoListaLigada(){
        LinkedList listaLigada = new LinkedList();
        assertEquals(0,listaLigada.size());
    }

    @Test
    public void TesteAdicaoDeElementos() throws Throwable {
        LinkedList listaLigada = new LinkedList();
        Pessoa p = new Pessoa("Goku");
        listaLigada.add(p);
        Pessoa p2 = new Pessoa("Picolo");
        listaLigada.add(p2);
        System.out.println(listaLigada.toString());
        assertEquals(2,listaLigada.size());
    }


}