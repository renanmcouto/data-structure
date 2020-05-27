package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;

public class ListaLigada {
    private Node primeiro;
    private Node ultimo;
    private Integer quantidadeDeNode;

    public ListaLigada(){
        this.primeiro = null;
        this.ultimo = null;
        this.quantidadeDeNode = 0;
    }

    public void adicionar(Pessoa elemento) {
        if (this.quantidadeDeNode == 0) {
            Node novoNode = new Node(this.primeiro, elemento);
            this.primeiro = novoNode;
            this.ultimo = this.primeiro;
        } else {
            Node novoNode = new Node(elemento);
            novoNode.setProximo(this.primeiro);
            this.primeiro = novoNode;
        }
        this.quantidadeDeNode++;
    }

    public void adicionarNoFim(Pessoa elemento){
        if(this.quantidadeDeNode == 0){
            this.adicionar(elemento);
        }else{
            Node novoNode = new Node(elemento);
            this.ultimo.setProximo(novoNode);
            this.ultimo = novoNode;
        }
        this.quantidadeDeNode++;
    }

    public void adicionarEmPosicao(int posicao,Pessoa elemento){
        if(posicao == quantidadeDeNode){
            this.adicionarNoFim(elemento);
        }else if(posicao == 0){
            this.adicionar(elemento);
        }else if(this.validaPosicao(posicao)){
            Node novoNode = new Node(elemento);
            Node atual = this.primeiro;
            for(int i=0; i<posicao-1; i++){
                atual = atual.getProximo();
            }
            novoNode.setProximo(atual.getProximo());
            atual.setProximo(novoNode);
            this.quantidadeDeNode++;
        }
    }

    public void removerDoFim(){
        Node atual = this.primeiro;
        for(int i=0; i<quantidadeDeNode-2; i++){
            atual = atual.getProximo();
        }
        this.ultimo = atual;
        atual.setProximo(null);
        this.quantidadeDeNode--;
    }

    public void removerDoInicio(){
        Node atual = this.primeiro;
        atual  = atual.getProximo();
        this.primeiro = atual;
        this.quantidadeDeNode--;
    }



    public Integer tamanho(){
        return this.quantidadeDeNode;
    }

    public boolean validaPosicao(int posicao){
        if(posicao >= 0 && posicao < this.quantidadeDeNode){
            return true;
        }else{
            throw new IllegalArgumentException("Posição invalida");
        }
    }

    public Object buscarPorPosicao(int posicao){
        Node atual = this.primeiro;
        if(validaPosicao(posicao)){
            for(int i=0; i<posicao; i++){
                atual = atual.getProximo();
            }
        }
        return atual.getElemento();
    }



    public String toString(){
        if(this.quantidadeDeNode == 0){
            return "[]";
        }
        Node atual = this.primeiro;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for(int i=0; i<this.quantidadeDeNode - 1; i++){
            stringBuilder.append(atual.getElemento());
            stringBuilder.append(", ");
            atual = atual.getProximo();
        }

        stringBuilder.append(atual.getElemento());
        stringBuilder.append("]");

        return stringBuilder.toString();

    }
}
