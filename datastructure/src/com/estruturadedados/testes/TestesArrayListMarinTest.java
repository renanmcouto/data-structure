package com.estruturadedados.testes;

import com.estruturadedados.arraylist.ArrayListMarin;
import com.estruturadedados.arraylist.tipo.Aluno;
import org.junit.Test;

import static org.junit.Assert.*;
//Utilizando Cucumber.
public class TestesArrayListMarinTest {

    //DADO esses valores, QUANDO acontecer isso, ENTÂO me retorne isso.

    @Test
    public void shouldReturnTwoNames(){
        //GIVEN
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.setNome("jose");
        a2.setNome("kakashi");
        ArrayListMarin lista = new ArrayListMarin();
        //WHEN
        lista.adiciona(a1);
        lista.adiciona(a2);
        //Then
        System.out.println(lista.toString());
    }

}