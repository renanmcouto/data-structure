package com.exercicioshackerrank;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        Integer[] a1 = new Integer[4];
        Integer[] a2 = new Integer[3];

        a1[0] = 10;
        a1[1] = 11;
        a1[2] = 12;
        a1[3] = 13;


        a2[0] = 10;
        a2[1] = 11;
        a2[2] = 99;

        for(int i=0; i<a1.length; i++){
            if(a1[i] == a2[i]){
                System.out.println("IGUAL!");
            }else
                System.out.println("Não IguAL");
        }


    }


}
