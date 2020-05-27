package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaLigadaTest {
    @Test
    public void testAdicionarDeUmElemento(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Juca"));
        System.out.println(lista.toString());
    }

    @Test
    public void testAdicionarDoisElementos(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Carlota"));
        lista.adicionar(new Pessoa("Ryu"));
        lista.adicionar(new Pessoa("Kiki"));
        System.out.println(lista.toString());
    }

    @Test
    public void testDeInsercaoNoFimDaLista(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Carlota"));
        lista.adicionar(new Pessoa("Carol"));
        lista.adicionar(new Pessoa("Cristina"));
        lista.adicionarNoFim(new Pessoa("Rafaela"));
        System.out.println(lista.toString());
    }

    @Test
    public void testDeBuscaDeNode(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Carlota"));
        lista.adicionar(new Pessoa("Carol"));
        lista.adicionar(new Pessoa("Cristina"));
        lista.adicionar(new Pessoa("Roberto"));
        lista.adicionarNoFim(new Pessoa("Rafaela"));
        System.out.println(lista.buscarPorPosicao(3));
    }

    @Test
    public void testAdicaoemPosicao(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Carlota"));
        lista.adicionar(new Pessoa("Carol"));
        lista.adicionar(new Pessoa("Cristina"));
        lista.adicionarEmPosicao(1, new Pessoa("Majara"));
        lista.adicionarEmPosicao(2, new Pessoa("Lucas"));
        System.out.println(lista.toString());
    }

    @Test
    public void testRemoverDoFinal(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Carlota"));
        lista.adicionar(new Pessoa("Carol"));
        lista.adicionar(new Pessoa("Cristina"));
        lista.removerDoFim();
        System.out.println(lista.toString());
        System.out.println("Esperado 2 e Resultado "+lista.tamanho());
        System.out.println("Ultimo da Lista "+lista.buscarPorPosicao(1));
    }

    @Test
    public void testRemoverDoInicio(){
        ListaLigada lista = new ListaLigada();
        lista.adicionar(new Pessoa("Carlota"));
        lista.adicionar(new Pessoa("Carol"));
        lista.adicionar(new Pessoa("Cristina"));
        lista.removerDoInicio();
        System.out.println(lista.toString());
    }

}