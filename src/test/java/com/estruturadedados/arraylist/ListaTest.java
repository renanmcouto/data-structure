package com.estruturadedados.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListaTest {

    @Test
    public void testCriacaoLista() {
        Lista lista = new Lista(10);

        Assertions.assertEquals(0, lista.size());
    }

    public void testCriacaoListaComTamanhoDefault() {
        // criar uma lista sem que seja necessário informar a quantidade de elementos
        // talvez seja necessário criar outro construtor na Lista
        // Faça um Assertions para verificar se o tamanho da linha é zero
    }

    @Test
    public void testTamanhoLista() {
        // inserir 3 elementos na lista
        // verificar se o tamanho da lista é realmente 3
    }

    @Test
    public void testInsercaoNaLista() {
        // inserir 2 elementos na lista
        // fazer um findByIndex em cada um dos elementos da lista e verificar se
        // esses são os elementos epserados mesmo
    }

    @Test
    public void testAtualizacaoElementoLista() {
        // insira 2 elementos na lista
        // faça a troca de posicao dos dois elementos
        // verifique se a troca foi realmente efetuada
    }

    @Test
    public void testLancaExcecaoFazendoTrocaComPosicaoInvalida() {
        // insira 1 elemento na lista
        // tente fazer a troca do elemento na posição 2
        // garanta que será lançada uma exceção para esse caso
    }

}
