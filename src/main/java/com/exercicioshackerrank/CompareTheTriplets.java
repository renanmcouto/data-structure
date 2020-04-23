package com.exercicioshackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        int alicept = 0,bobpt =0;


        alice.add(scanner.nextInt());
        alice.add(scanner.nextInt());
        alice.add(scanner.nextInt());

        bob.add(scanner.nextInt());
        bob.add(scanner.nextInt());
        bob.add(scanner.nextInt());

        for(int i=0; i<alice.size(); i++){
            if(alice.get(i) > bob.get(i)){
                alicept += 1;
            }else if(bob.get(i) > alice.get(i)){
                bobpt += 1;
            }

        }

        System.out.println(alicept+" "+bobpt);

    }
}
