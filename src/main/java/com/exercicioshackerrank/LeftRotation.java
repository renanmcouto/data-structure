package com.exercicioshackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aux;
        ArrayList<Integer> arraylist = new ArrayList<>();

        int numerosParaAdicionar = scanner.nextInt();

        int quantasVezesRodar = scanner.nextInt();

        for(int i=0; i<numerosParaAdicionar; i++){
            arraylist.add(scanner.nextInt());
        }
        System.out.println(arraylist);

        for(int i=0; i<quantasVezesRodar; i++){
            arraylist.add(arraylist.get(0));
            arraylist.remove(0);
            System.out.println(arraylist);

        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<arraylist.size(); i++){
            stringBuilder.append(arraylist.get(i));
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);

    }
}
