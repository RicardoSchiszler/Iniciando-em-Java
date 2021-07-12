package com.ricardoschiszler.EscopoDeVariaveis;

public class EscopoDeVariaveis {
    public static void main(String[] args) {
        //ESCOPO DE VARIAVEIS
        if (true) {
            int x = 10; // variavel local, morre dentro do bloco de código.
        }
        System.out.println(x);


        // VARIAVEIS IMUTAVEIS (CONSTANTES)

        final double PI = 3.14159; // declara variavel imutavel (constante), valor FINAL!

        PI = 20; // constantes não permite alteração

    }
}
