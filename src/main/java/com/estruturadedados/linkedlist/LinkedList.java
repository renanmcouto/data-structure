package com.estruturadedados.linkedlist;

import com.entitys.Pessoa;
import com.estruturadedados.lista.ListaDoMarin;

public class LinkedList implements ListaDoMarin<Pessoa> {

    private Node primeira; //referencia usado para apontar sempre para primeira posição.
    private Node ultima; //referencia usado para apontar para a ultima posição.
    private int quantidadeDeNo; //Usado para mostrar tamanho da lista, e também para saber se está vazia etc...

    //Método que Adiciona no começo da lista
    @Override
    public void add(Pessoa elemento) throws Throwable {
        Node novoNode = new Node(this.primeira,elemento); //o NÓ é criado e aponta para NULL já que é tratado como o primeiro.
        this.primeira = novoNode;
        if(this.quantidadeDeNo == 0) {
            this.ultima = this.primeira;
        }
        this.quantidadeDeNo++;
    }

    //Adiciona o novo membro ao fim da lista.
    public void addLastPosition(Pessoa elemento) throws Throwable {
       if(this.quantidadeDeNo ==0){
           this.add(elemento);
       }
       else{
           Node novoNode = new Node(elemento);
           this.ultima.setProximo(novoNode);
           this.ultima = novoNode;
           this.quantidadeDeNo++;
       }
    }

    public boolean occupedPosition(int posicao){
        return posicao >=0 && posicao < this.quantidadeDeNo;
    }

    /**
     * Mètodo criado para pegar o node, porque quando formos adicionar algum objeto no meio da lista precisamos do seu anterior para arrumar a referencia proximo;
     * @param posicao
     * @return
     */
    private Node pegaNode(int posicao){
        if(!occupedPosition(posicao)){
            throw new IllegalArgumentException("Posição não existe.");
        }
        Node atual = this.primeira;
        for(int i=0; i<posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }


    public void addInPosition(int posicao,Pessoa elemento) throws Throwable {
        if(posicao == 0){ //Vai ser o começo da lista no caso se a posição é 0!
            this.add(elemento);
        }else if(posicao == this.quantidadeDeNo){ //Porque para cada Adição a quantidade recebe 1 logo apontando para o fim da fila então seria adicionar ao fim.
            this.addLastPosition(elemento);
        }else{
            Node nodeAnterior = this.pegaNode(posicao - 1); //Aqui vamos apontar nossa referencia para um nó antes da posição que queremos adicionar para arrumar seu proximo.
            Node newNode = new Node(nodeAnterior.getProximo(),elemento); //Nesta parte criamos o novo NÓ e ASSIM que criamos já passamos para ele que para o PROXIMO NÓ que ele vai apontar é o que estava no lugar que ele entrou
            nodeAnterior.setProximo(newNode); //E no final vamos passar para o nó anterior a posição do novo nó para que ele aponte para o proximo o novo NÓ criado já que o novo nó criado já recebeu como proximo o antigo proximo do nó anterior a ele.
            this.quantidadeDeNo++;
        }
    }

    @Override
    public void remove(Pessoa posicao) {

    }

    @Override
    public Pessoa findByIndex(Integer posicao) {
        if(!occupedPosition(posicao)){
            throw new IllegalArgumentException("Posição não existe.");
        }
        return pegaNode(posicao).getElemento();
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
            stringBuilder.append(atual.getElemento());
            stringBuilder.append(", ");
            atual = atual.getProximo();
        }

        stringBuilder.append(atual.getElemento());
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
