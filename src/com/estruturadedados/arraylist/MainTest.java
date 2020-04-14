package com.estruturadedados.arraylist;

public class MainTest {
    public static void main(String[] args){
        Lista lista = new Lista(4);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        System.out.println("Item Adicionado: "+lista.toString());
        System.out.println("Tamanho Lista Marin: "+lista.size());

        lista.remove(1);
        System.out.println("Lista com remoção: "+lista.toString());

        lista.add(20);
        System.out.println("Item Adicionado: "+lista.toString());

        lista.update(21,2);
        System.out.println("Item com Atualização: "+lista.toString());

        lista.update(99, 5);

        System.out.println("Procurar pelo indice 2: "+ lista.findByIndex(2));
        System.out.println("Procurar pelo Indice não existente: "+ lista.findByIndex(90));

    }
}
