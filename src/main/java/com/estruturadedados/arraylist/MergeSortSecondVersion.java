package com.estruturadedados.arraylist;

public class MergeSortSecondVersion {

    public void mergeSort(Object[] lista,Integer inicio,Integer fim){
        if(fim - inicio > 1) {
            Integer meio = (fim + inicio) / 2;
            //Cuida da parte do inicio ao meio da esquerda ao meio do vetor
            mergeSort(lista, inicio, meio);
            //Cuida da parte do meio ao Fim
            mergeSort(lista, meio, fim);
            //Junta as partes.
            merge(lista, inicio, meio, fim);
        }
    }

    private void merge(Object[] lista, Integer inicio, Integer meio, Integer fim) {
        //para adicionar valores que estão na parte esquerda do vetor no caso do inicio ate o meio
        Object[] vetorEsquerdo = new Object[(fim + inicio) / 2];
        for(int i=0; i<meio-1; i++){
            vetorEsquerdo[i] = lista[i];
        }

    }

}
