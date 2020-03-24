package com.estruturadedados.arraylist;

import com.estruturadedados.arraylist.tipo.Aluno;

import java.util.Arrays;

public class ArrayListMarin {

    private Aluno[] alunos;
    private int tamanho;

    public ArrayListMarin(int tamanhoTotal){
        this.alunos = new Aluno[tamanhoTotal];
        this.tamanho = 0;
    }

    public ArrayListMarin(){
        this.alunos = new Aluno[30];
    }

    public void adiciona(Aluno aluno) {
        if(this.tamanho < this.alunos.length){
            this.alunos[this.tamanho] = aluno;
            this.tamanho++;
        }
    }

    public void adiciona(int posicao, Aluno aluno) {
        if(posicao > 0 && this.tamanho < this.alunos.length){
            for(int i=this.tamanho; i>=posicao; i++){
                this.alunos[i+1] = this.alunos[i];
            }
            this.alunos[posicao] = aluno;
            this.tamanho++;
        }
    }

    public Aluno pega(int posicao) {
        return null;
    }
    public void remove(int posicao) {
        // implementação
    }

    public boolean contem(Aluno aluno) {
        return false;
    }
    public int mostreTotal() {
         return this.tamanho;
    }

    public String toString(){

        StringBuilder string = new StringBuilder();

        string.append("[");

        for(int i=0; i<this.tamanho-1; i++){
            string.append(alunos[i]);
            string.append(", ");
        }

        if(this.tamanho > 0){
            string.append(this.alunos[this.tamanho-1]);
        }

        string.append("]");
        return string.toString();
    }

}
