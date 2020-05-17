package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;

public class Node {
    private Node proximo;
    private Pessoa elemento;

    public Node(Node proximo,Pessoa pessoa){
        this.proximo = proximo;
        this.elemento = pessoa;
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

    public Pessoa getP() {
        return elemento;
    }
}
