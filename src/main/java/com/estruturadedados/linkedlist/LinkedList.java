package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;
import com.estruturadedados.lista.ListaDoMarin;

public class LinkedList implements ListaDoMarin<Pessoa> {


    private Node primeira;

    private Node ultima;
    //Definir quantos nó existem em nossa linkedList(Lista Encadeada)
    private Integer quantidadeDeNo;

    public LinkedList() {
        this.primeira = null;
        this.ultima = null;
        this.quantidadeDeNo = 0;
    }

    //Método que Adiciona no começo da lista
    @Override
    public void add(Pessoa elemento) throws Throwable {
        Node newNode = new Node(this.primeira,elemento);
        this.primeira = newNode;
        if(this.quantidadeDeNo == 0){
            //Valida se a lista está vazia
            this.ultima = this.primeira;
        }
        this.quantidadeDeNo++;
    }

    //Método que adiciona elemento na ultima posição.
    public void addLast(Pessoa elemento) throws Throwable {
        if(this.quantidadeDeNo == 0){
            //Se a lista for vazia ele será tanto o ultimo como o primeiro logo vai ser a adição normal do começo da lista por isso reutilizei o meu "add" já criado caso a lista seja vazia.
            this.add(elemento);
        }else{
            Node newNode = new Node(elemento);
            this.ultima.setProximo(newNode);
            this.ultima = newNode;
            this.quantidadeDeNo++;
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
        return this.quantidadeDeNo;
    }

    //Valida se a posição é valida e depois valida se a posição está dentro do tamanho da lista.
    public boolean OccupiedPosition(Integer position){
        return position >= 0 && position < this.quantidadeDeNo;
    }

    public String toString(){
        if(this.quantidadeDeNo == 0){
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node atual = primeira;

        for(int i=0; i<this.quantidadeDeNo - 1; i++) {
            stringBuilder.append(atual.getP());
            stringBuilder.append(", ");
            atual = atual.getProximo();
        }

        stringBuilder.append(atual.getP());
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
