package com.estruturadedados.pilhas;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Pilha {

    /* Estamos utilizando linkedlista pela facil inserção no fim e retirada no fim da pilha,
       Já existe uma classe no Java criada pra agir como uma pilha chamada de Stack.
     */
    private List<String> listapilha = new LinkedList<>();
    private Stack<String> pilhaJava = new Stack<>();

    public void inserir(String valor){
        listapilha.add(valor);
    }

    public void remove(){
        listapilha.remove(listapilha.size()-1);
    }

    public boolean vazia(){
        return listapilha.isEmpty();
    }

    public Integer tamanhoPilha(){
        return listapilha.size();
    }

    public String toString(){
        return listapilha.toString();
    }
}
