package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;

public class Node {
    private Node proximo;
    private Pessoa p;

    public Node(Node proximo,Pessoa pessoa){
        this.proximo = proximo;
        this.p = pessoa;
    }

    public Node(Pessoa pessoa){
        this.p = pessoa;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Pessoa getP() {
        return p;
    }
}
