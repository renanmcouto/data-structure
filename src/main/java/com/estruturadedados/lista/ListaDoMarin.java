package com.estruturadedados.lista;

public interface ListaDoMarin<T> {

    public void add(T elemento) throws Throwable;

    public void remove(T posicao);

    public int findByIndex(T position);

    public void update(T value, T index);

    public void reverse();

    public int size();

}
