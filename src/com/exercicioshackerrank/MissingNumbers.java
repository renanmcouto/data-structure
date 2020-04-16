package com.exercicioshackerrank;

import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jj=0;

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

        for (int i = 0; i < arr.length; i++) {
            if (i < arr[i]) {
                for(int j=jj; j<brr.length; j++) {
                    if (brr[j] < arr[i]) {
                        System.out.println(brr[j]);
                        jj++;
                    }else{
                        jj++;
                        break;
                    }
                }
            }
        }
    }
}
