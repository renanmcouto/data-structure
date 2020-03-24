package com.exercicioshackerrank;

import java.util.ArrayList;

public class MeiasParaVender {

    public static void main(String[] args) {

        int parMeias = 0;

        ArrayList<String> meias = new ArrayList<String>();

        meias.add("R");
        meias.add("V");
        meias.add("V");
        meias.add("V");
        meias.add("A");
        meias.add("C");
        meias.add("C");
        meias.add("V");
        meias.add("V");
        meias.add("A");
        meias.add("R");
        meias.add("B");
        meias.add("B");

        for(int a=meias.size(); a>0; a--){
            for(int b=a; b<meias.size()-1; b++){
                if (meias.get(a).equals(meias.get(b)))
                    parMeias++;
                meias.remove(a);
                meias.remove(b);
            }
        }

        System.out.println(parMeias);
    }
}
