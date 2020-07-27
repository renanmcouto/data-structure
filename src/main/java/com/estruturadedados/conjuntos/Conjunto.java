package com.estruturadedados.conjuntos;

import java.util.LinkedList;
import java.util.List;

public class Conjunto {

    /**
     * Utilizamos, de LinkedList dentro de LinkedListas, porque quando se trata de conjuntos,
     * ele faz a separação do que é adicionado dentro dele em um lugar especifico utilizando o
     * Hashcode dos Objetos que são adicionados.
     */
    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();

    public Conjunto() {
        for(int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    private int calculaIndiceDaTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String palavra) {
        if(!contem(palavra)) {
            int indice = calculaIndiceDaTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.add(palavra);
        }
    }

    private boolean contem(String palavra) {
        int indice = calculaIndiceDaTabela(palavra);
        return tabela.get(indice).contains(palavra);
    }

    @Override
    public String toString() {
        return tabela.toString();
    }

}
