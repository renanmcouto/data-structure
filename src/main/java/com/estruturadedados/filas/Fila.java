package com.estruturadedados.filas;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Fila {

    private List<String> alunos = new LinkedList<>();
    Queue<String> filaDoJava = new LinkedList<>();

    public void inserir(String aluno){
        alunos.add(aluno);
    }

    public void remover(){
        alunos.remove(0);
    }


}
