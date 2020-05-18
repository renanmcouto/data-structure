package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;

public class MainTest {
    public static void main(String[] args) throws Throwable {
        LinkedList listaLigada = new LinkedList();
        Pessoa p1 = new Pessoa("Goku");
        Pessoa p2 = new Pessoa("Gabriel");
        listaLigada.add(p1);
        listaLigada.add(p2);
        System.out.println(listaLigada.toString());

        Pessoa p3 = new Pessoa("Rillary");
        listaLigada.addLastPosition(p3);

        System.out.println(listaLigada.toString());


        Pessoa p4 = new Pessoa("Majara");
        listaLigada.addInPosition(1,p4);
        System.out.println(listaLigada.toString());

        System.out.println(listaLigada.findByIndex(1));

    }
}
