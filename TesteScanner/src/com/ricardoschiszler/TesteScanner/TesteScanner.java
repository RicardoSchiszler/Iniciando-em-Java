package com.ricardoschiszler.TesteScanner;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args){

        String nome;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");

        nome = input.nextLine();

        System.out.println("Olá, " + nome);

    }
}
