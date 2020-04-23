package com.exercicioshackerrank;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LeftRotationWithArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int quantidadeDeNumero = scanner.nextInt();

        int quantidadeDeRotacao = scanner.nextInt();

        Integer[] arrA = new Integer[quantidadeDeNumero];
        Integer[] arrB = new Integer[quantidadeDeNumero];

        for(int i=0; i<arrA.length; i++){ arrA[i] = scanner.nextInt(); }

        for(int i=0; i<quantidadeDeNumero; i++){
            if(i < quantidadeDeRotacao){
                arrB[quantidadeDeNumero - quantidadeDeRotacao + i] = arrA[i];
            }else{
                arrB[i-quantidadeDeRotacao] = arrA[i];
            }
        }

        for(int i=0; i<arrB.length; i++){
            System.out.printf(arrB[i]+" ");
        }


    }

}
