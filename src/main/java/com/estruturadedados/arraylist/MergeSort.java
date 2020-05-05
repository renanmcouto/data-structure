package com.estruturadedados.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public static void mergeSort(Integer[] arrayA, Integer[] arrayB, Integer inicio, Integer fim){
        //Usado para começar a recursão
        if(inicio < fim){
            Integer meio = (inicio + fim) / 2;
            //Valida Primeira parte no caso da Esquerda(inicio) ao Meio do vetor
            mergeSort(arrayA,arrayB,inicio,meio);
            //Valida a Segunda parte que é do meio até o fim do vetor
            mergeSort(arrayA,arrayB,meio+1,fim);
            merge(arrayA,arrayB,inicio,meio,fim);
        }
    }

    private static void merge(Integer[] arrayA, Integer[] arrayB, Integer inicio, Integer meio, Integer fim) {
        for(int k = inicio; k <= fim; k++){
            arrayA[k] = arrayB[k];
        }

        //Criado para andar a primeira metade do vetor
        int i = inicio;
        //Criado para andar a segunda metade do vetor
        int j = meio + 1;

        for(int k=inicio; k<=fim; k++){
            if(i > meio){
                arrayA[k] = arrayB[j++];
            }
            else if(j > fim){
                arrayA[k] = arrayB[i++];
            }
            else if(arrayB[i] < arrayB[j]){
                arrayA[k] = arrayB[i++];
            }
            else{
                arrayA[k] = arrayB[j++];
            }
        }

    }


    public static void main(String[] args) {
        Integer[] arrA = new Integer[8];
        Integer[] arrB = new Integer[arrA.length];

        Random random = new Random();

        for(int i=0; i<arrA.length; i++){
            arrA[i] = random.nextInt(100);
        }


        for(Integer obj: arrA){
            System.out.print(obj+" ");
        }
        System.out.println(" ");

        mergeSort(arrA,arrB,0,arrA.length-1);

        for(Integer obj: arrA){
            System.out.print(obj+" ");
        }

    }
}
