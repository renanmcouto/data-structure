package com.estruturadedados.vetor;

import com.entitys.Pessoa;

import java.util.Arrays;

public class Vetor {

    private Pessoa[] pessoas = new Pessoa[100];

    public void adiciona(Pessoa pessoa){
        for(int i=0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = pessoa;
                break;
            }
        }
    }

    public String toString(){
        return Arrays.toString(pessoas);
    }
}
