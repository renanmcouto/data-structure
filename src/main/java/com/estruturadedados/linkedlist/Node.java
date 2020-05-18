package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;

public class Node {

    private Node proximo;
    private Pessoa elemento;

    public Node(Node proximo,Pessoa elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Node(Pessoa pessoa){
        this.elemento = pessoa;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Pessoa getElemento() {
        return elemento;
    }
}
