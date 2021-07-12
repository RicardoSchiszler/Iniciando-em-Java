package com.ricardoschiszler;

public class App {

    // padrão (default)
    // public (visibilidade publica para todos os packages)
    // private (visibilidade privada para todos os packages, somente a classe atual pode acessar essa variavel)
    // protected (depende de POO, futuramente será explicado)
    private static int x; //será acessível pela função

    public static void main(String[] args) {
            // VISIBILIDADE DE ESCOPO
        // int x; - não será acessivel pela função
    }
    public static void sum (int a, int b){
        System.out.println(x);
    }
}
