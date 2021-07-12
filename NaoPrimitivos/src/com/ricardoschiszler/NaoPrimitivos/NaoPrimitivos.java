package com.ricardoschiszler.NaoPrimitivos;

public class NaoPrimitivos {
    public static void main(String[] args){
        int x = 2; // primitivo consome menos espaço de memória, PREFERENCIA PARA ARMAZENAR INFORMAÇÕES SIMPLES!
        Integer y = 4; // objeto não primitivo, envelopa o int primitivo e com mais funções, USADO EM OPERAÇÕES COM INTEIROS.

        System.out.println(x);
        System.out.println(y);
        // use "y." para verificar as inúmeras funções uteis para Y.
        y.toString();


    }
}
