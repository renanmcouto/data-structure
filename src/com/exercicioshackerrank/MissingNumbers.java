package com.exercicioshackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jj=0;
        ArrayList<Integer> numerosFaltando = new ArrayList();

        int valorPrimeiroArray = scanner.nextInt();
        int[] arr = new int[valorPrimeiroArray];


        for (int i = 0; i < valorPrimeiroArray; i++) {
            arr[i] = scanner.nextInt();
        }

        int valorSegundoArray = scanner.nextInt();
        int[] brr = new int[valorSegundoArray];

        for (int i = 0; i < valorSegundoArray; i++) {
            brr[i] = scanner.nextInt();
        }

        scanner.close();

        //Faz a inserção dentro da lista.
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

        //Remove duplicações dentro da lista.
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

        //Organiza a Lista por ordem.
        for(int i=0; i<numerosFaltando.size()-1; i++){
            if(!(numerosFaltando.get(i) < numerosFaltando.get(i+1))){
                int aux = numerosFaltando.get(i);
                numerosFaltando.remove(i);
                numerosFaltando.add(aux);
            }
        }
        //Printa o Resultado
        for(int i=0; i<numerosFaltando.size(); i++){
            if(i < numerosFaltando.size()-1) {
                System.out.print(numerosFaltando.get(i) + " ");
            }else{
                System.out.print(numerosFaltando.get(i));
            }
        }
    }
}
