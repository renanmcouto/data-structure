package com.estruturadedados.lista;

import java.util.ArrayList;

public class Lista implements ListaDoMarin<Integer> {

    private Integer[] arr; //Instancia de um array
    private Integer apontaParaUltimaPosicao;
    private Integer aux;

    public Lista(Integer elementos) {
        if (!(elementos <= 0)) {
            this.arr = new Integer[elementos];
            this.apontaParaUltimaPosicao = 0;
        } else {
            System.out.println("Vetor de 0 Posições é invalido.");
        }
    }

    public Lista() {
        this.arr = new Integer[10];
        this.apontaParaUltimaPosicao = 0;
    }

    @Override
    public void add(Integer elemento) throws Throwable {
        if (this.apontaParaUltimaPosicao < this.arr.length) {
            this.arr[apontaParaUltimaPosicao] = elemento;
            this.apontaParaUltimaPosicao++;
        } else {
            throw new Throwable("NÂO TEM MAIS ESPAÇO");
        }
    }

    /**
     * Feito para facilidar a troca de itens dentro do array.
     *
     * @param posicaoUm   responsavel por receber o valor da posicaoDois
     * @param posicaoDois responsavel por receber o valor da posicaoUm
     */
    public void switchObject(Integer posicaoUm, Integer posicaoDois) {
        Integer aux = this.arr[posicaoUm];
        this.arr[posicaoUm] = this.arr[posicaoDois];
        this.arr[posicaoDois] = aux;
    }

    @Override
    public void remove(Integer posicao) {
        if (posicao < this.apontaParaUltimaPosicao && posicao >= 0) {
            for (int i = posicao; i < this.arr.length - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
        }
        this.apontaParaUltimaPosicao--;
    }

    @Override
    public Integer findByIndex(Integer position) {
        if (position >= 0 && position <= this.apontaParaUltimaPosicao) {
            return this.arr[position];
        }
        return -1;
    }

    @Override
    public void update(Integer value, Integer index) {
        if (index >= 0 && index < this.arr.length) {
            this.arr[index] = value;
        } else {
            System.out.println("Posição Invalida");
        }
    }

    @Override
    public void reverse() {
        int jj=0;
        Integer[] arrReverse = new Integer[this.arr.length];
        for (int i = this.arr.length-1 ; i>=0; i--) {
            for (int j = jj; j < this.arr.length; j++) {
                arrReverse[j] = this.arr[i];
                jj++;
                break;
            }
        }
        this.arr = arrReverse;
    }

    public void bubbleSort() {
        for (int i = 0; i < this.arr.length - 1; i++) {
            for (int j = 0; j < this.arr.length - 1; j++) {
                if (this.arr[j] > this.arr[j + 1]) { //valida se a posição J é J+1 se for maior exemplo {4(j) 3(J+1) 5 1} > {3451} > {3 4(J) 5(J+1) 1}
                    aux = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = aux;
                }
            }
        }
    }

    @Override
    public int size() {
        return this.apontaParaUltimaPosicao;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("[");

        for (int i = 0; i < this.apontaParaUltimaPosicao - 1; i++) {
            builder.append(this.arr[i]);
            builder.append(",");
        }

        if (this.apontaParaUltimaPosicao > 0) {
            builder.append(this.arr[this.apontaParaUltimaPosicao - 1]);
        }

        builder.append("]");

        return builder.toString();
    }

}
