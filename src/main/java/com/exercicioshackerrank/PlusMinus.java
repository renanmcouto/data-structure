package com.exercicioshackerrank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.
 * For example, given the array arr = [1,1,0,-1,-1] there are 5 elements, two positive, two negative and one zero. Their ratios would be  2 / 5 = 0.400000
 * ,2 / 5 = 0.400000 and 1 / 5 = 0.200000. It should be printed as
 */
public class PlusMinus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int negativo = 0;
        int positivo = 0;
        int neutro = 0;

        int repetir = scanner.nextInt();

        for(int i=0; i<repetir; i++){
            arr.add(scanner.nextInt());
        }

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > 0){
                positivo++;
            }else if(arr.get(i) < 0){
                negativo++;
            }else{
                neutro++;
            }
        }

        System.out.println("positivos: "+positivo+" Negativo: "+negativo+" Neutro: "+ neutro);

        double resultadoPositivo = (double) positivo / repetir;
        double resultadoNegativo = (double) negativo / repetir;
        double resultadoNeutro = (double) neutro / repetir;

        NumberFormat format = new DecimalFormat("0.00000");
        System.out.println(format.format(resultadoPositivo));
        System.out.println(format.format(resultadoNegativo));
        System.out.println(format.format(resultadoNeutro));



    }
}
