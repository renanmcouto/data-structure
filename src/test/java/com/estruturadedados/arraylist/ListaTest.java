package com.estruturadedados.arraylist;

import com.estruturadedados.lista.Lista;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
        Assertions.assertEquals(3,lista.size());
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
        Assertions.assertSame(99,lista.findByIndex(0));
        Assertions.assertSame( 25,lista.findByIndex(1));
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
        Assertions.assertSame(100,lista.findByIndex(0));
        Assertions.assertSame(50,lista.findByIndex(1));
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

    @Test
    public void testReverterListaComCinco() throws Throwable {
        Lista lista = new Lista(5);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(lista.toString());
        lista.reverse();
        System.out.println(lista.toString());
    }

    @Test
    public void testReverterListaComDez() throws Throwable {
        Lista lista = new Lista(11);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        System.out.println(lista.toString());
        lista.reverse();
        System.out.println(lista.toString());
    }

    @Test
    public void testRemover() throws Throwable {
        Lista lista = new Lista(5);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.remove(3);
        System.out.println(lista.toString());
        lista.remove(1);
        System.out.println(lista.toString());
    }

}
