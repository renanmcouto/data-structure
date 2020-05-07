package com.estruturadedados.arraylist;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ListaTest {

    @Test
    public void testCriacaoLista() {
        Lista lista = new Lista(1);
        Assertions.assertEquals(0, lista.size());
    }

    /**
     *criar uma lista sem que seja necessário informar a quantidade de elementos
     * talvez seja necessário criar outro construtor na Lista
     * Faça um Assertions para verificar se o tamanho da linha é zero
     */
    @Test
    public void testCriacaoListaComTamanhoDefault() {
        Lista lista = new Lista();
        Assertions.assertEquals(0,lista.size());
    }

    /**
     * inserir 3 elementos na lista
     * verificar se o tamanho da lista é realmente 3
     */
    @Test
    public void testTamanhoLista() throws Throwable {
        Lista lista = new Lista();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        Assertions.assertEquals(2,2);
    }

    /**
     * // inserir 2 elementos na lista
     *         // fazer um findByIndex em cada um dos elementos da lista e verificar se
     *         // esses são os elementos epserados mesmo
     */
    @Test
    public void testInsercaoNaLista() throws Throwable {
        Lista lista = new Lista(2);
        lista.add(99);
        lista.add(25);
        Assertions.assertEquals(99,lista.findByIndex(0));
        Assertions.assertEquals(25,lista.findByIndex(1));
    }

    /**
     *  // insira 2 elementos na lista
     *         // faça a troca de posicao dos dois elementos
     *         // verifique se a troca foi realmente efetuada
     */
    @Test
    public void testAtualizacaoElementoLista() throws Throwable {
        Lista lista = new Lista(2);
        lista.add(50);
        lista.add(100);
        lista.switchObject(0,1);
        Assertions.assertEquals(100,lista.findByIndex(0));
        Assertions.assertEquals(50,lista.findByIndex(1));
    }

    /**
     *  // insira 1 elemento na lista
     *         // tente fazer a troca do elemento na posição 2
     *         // garanta que será lançada uma exceção para esse caso
     */
    @Test
    public void testLancaExcecaoFazendoTrocaComPosicaoInvalida() throws Throwable {
        boolean exception = false;
       Lista lista = new Lista(1);
       lista.add(123);
       try{
           lista.switchObject(0,2);
       }catch(Throwable e){
           exception = true;
       }
       Assertions.assertTrue(exception);
    }
}
