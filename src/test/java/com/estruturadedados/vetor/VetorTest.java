package com.estruturadedados.vetor;

import com.entitys.Pessoa;
import org.junit.Test;

public class VetorTest {

    @Test
    public void TestAdiciona(){
        Vetor vetor = new Vetor();
        Pessoa pessoa = new Pessoa("Joselfa");
        Pessoa pessoa2 = new Pessoa("Jose");
        Pessoa pessoa3 = new Pessoa("bose");
        vetor.adiciona(pessoa);
        vetor.adiciona(pessoa2);
        vetor.adiciona(pessoa3);
        System.out.println(vetor.toString());
    }

}