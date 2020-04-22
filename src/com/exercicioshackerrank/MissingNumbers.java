package com.exercicioshackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jj=0;
        ArrayList<Integer> numerosFaltando = new ArrayList();

        //int valorPrimeiroArray = scanner.nextInt();
        int[] arr = new int[10];

        arr[0] = 203;
        arr[1] = 204;
        arr[2] = 205;
        arr[3] = 206;
        arr[4] = 207;
        arr[5] = 208;
        arr[6] = 203;
        arr[7] = 204;
        arr[8] = 205;
        arr[9] = 206;

//        for (int i = 0; i < valorPrimeiroArray; i++) {
//            arr[i] = scanner.nextInt();
//        }

        //int valorSegundoArray = scanner.nextInt();
        int[] brr = new int[13];

        brr[0] = 203;
        brr[1] = 204;
        brr[2] = 204;
        brr[3] = 205;
        brr[4] = 206;
        brr[5] = 207;
        brr[6] = 205;
        brr[7] = 208;
        brr[8] = 203;
        brr[9] = 206;
        brr[10] = 205;
        brr[11] = 206;
        brr[12] = 204;

//        for (int i = 0; i < valorSegundoArray; i++) {
//            brr[i] = scanner.nextInt();
//        }

        //Pega os numeros que faltam dentro do outro array.
        for (int i = 0; i < arr.length; i++) {
            for(int j = jj; j < brr.length; j++){
                    if(brr[j] == arr[i]){
                        jj++;
                        break;
                }else{
                        numerosFaltando.add(brr[j]);
                        jj++;
                    }
            }
        }

        //Remove Numeros Duplicados.
        for(int i=0; i<numerosFaltando.size(); i++){
            for(int j=1; j<numerosFaltando.size(); j++){
                if(numerosFaltando.get(i).equals(numerosFaltando.get(j))){
                    numerosFaltando.remove(i);
                    break;
                }else {
                    break;
                }
            }
        }
        //Ordenação da Lista.
        for(int i=0; i<numerosFaltando.size()-1; i++){
            if(!(numerosFaltando.get(i) < numerosFaltando.get(i+1))){
                int aux = numerosFaltando.get(i);
                numerosFaltando.remove(i);
                numerosFaltando.add(aux);
            }
        }

        System.out.println(numerosFaltando.toString());
    }
}
