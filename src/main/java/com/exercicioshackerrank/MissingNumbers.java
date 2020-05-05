package com.exercicioshackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List lista = new ArrayList<Integer>();
        int jj = 0;

        Integer tamanhoA = scanner.nextInt();
        Integer[] arrayA = new Integer[tamanhoA];

        for (int i = 0; i < tamanhoA; i++) {
            arrayA[i] = scanner.nextInt();
        }

        Integer tamanhoB = scanner.nextInt();
        Integer[] arrayB = new Integer[tamanhoB];

        for (int i = 0; i < tamanhoB; i++) {
            arrayB[i] = scanner.nextInt();
        }

        //Mostra os valores do Vetor A
        for (int i = 0; i < arrayA.length; i++) {
            if (i < arrayA.length - 1) {
                System.out.print(arrayA[i] + ", ");
            } else {
                System.out.println(arrayA[i]);
            }
        }

        //Mostra os valores do Vetor B
        for (int i = 0; i < arrayB.length; i++) {
            if (i < arrayB.length - 1) {
                System.out.print(arrayB[i] + ", ");
            } else {
                System.out.println(arrayB[i]);
            }
        }

        //ordenação dos arrays
        //Collections.sort();

        System.out.println("Ordenados");

        for (int i = 0; i < arrayA.length; i++) {
            if (i < arrayA.length - 1) {
                System.out.print(arrayA[i] + ", ");
            } else {
                System.out.println(arrayA[i]);
            }
        }

        //Mostra os valores do Vetor B
        for (int i = 0; i < arrayB.length; i++) {
            if (i < arrayB.length - 1) {
                System.out.print(arrayB[i] + ", ");
            } else {
                System.out.println(arrayB[i]);
            }
        }


        //faz a inserção dos itens diferentes na outra lista
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = jj; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    jj++;
                    break;
                }
                lista.add(arrayB[j]);
                jj++;
            }
        }

        //Remove duplicações dentro da lista.
        for(int i=0; i<lista.size(); i++){
            for(int j=i+1; j<lista.size(); j++){
                if(lista.get(i).equals(lista.get(j))){
                    lista.remove(i);
                    break;
                }else {
                    break;
                }
            }
        }

        //Mostra os valores do Vetor B
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+" ");
        }
    }
}
