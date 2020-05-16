package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;
import com.estruturadedados.lista.ListaDoMarin;

public class LinkedList implements ListaDoMarin<Pessoa> {


    Node firstNode;

    Node lastNode;
    //Definir quantos nó existem em nossa linkedList(Lista Encadeada)
    Integer quantityNodes;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.quantityNodes = 0;
    }

    //Método que Adiciona no começo da lista
    @Override
    public void add(Pessoa elemento) throws Throwable {
        Node newNode = new Node(this.firstNode,elemento);
        this.firstNode = newNode;
        if(this.quantityNodes == 0){
            //Valida se a lista está vazia
            this.lastNode = this.firstNode;
        }
        this.quantityNodes++;
    }

    //Método que adiciona elemento na ultima posição.
    public void addLast(Pessoa elemento) throws Throwable {
        if(this.quantityNodes == 0){
            //Se a lista for vazia ele será tanto o ultimo como o primeiro logo vai ser a adição normal do começo da lista por isso reutilizei o meu "add" já criado caso a lista seja vazia.
            this.add(elemento);
        }else{
            Node newNode = new Node(elemento);
            this.lastNode.setProximo(newNode);
            this.lastNode = newNode;
            this.quantityNodes++;
        }

    }

    @Override
    public void remove(Pessoa posicao) {

    }

    @Override
    public int findByIndex(Pessoa position) {
        return 0;
    }

    @Override
    public void update(Pessoa value, Pessoa index) {

    }

    @Override
    public void reverse() {

    }

    @Override
    public int size() {
        return this.quantityNodes;
    }

    //Valida se a posição é valida e depois valida se a posição está dentro do tamanho da lista.
    public boolean OccupiedPosition(Integer position){
        return position >= 0 && position < this.quantityNodes;
    }

    public String toString(){
        if(this.quantityNodes == 0){
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node atual = firstNode;

        for(int i=0; i<this.quantityNodes - 1; i++) {
            stringBuilder.append(atual.getP());
            stringBuilder.append(", ");
            atual = atual.getProximo();
        }

        stringBuilder.append(atual.getP());
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
