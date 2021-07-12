package com.ricardoschiszler.Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String user; // será feita a entrada de dados e utilizadas para comparar com o login padrão.
        String password;
        Scanner input = new Scanner(System.in); // instância do objeto input do tipo Scanner.

        System.out.print("Usuário: ");
        user = input.nextLine(); // armazena o que foi digitado.

        System.out.print("Senha: ");
        password = input.nextLine();

        verificaLogin(user, password);

    }

    public static void verificaLogin(String user, String password){
        String usuario = "local"; // login.
        String senha = "123a"; //    padrão.
        if(password.equals(senha) && user.equalsIgnoreCase(usuario)) { // compara as strings, usuário ignora maiúsculo e minúsculo.

            System.out.printf("Bem-vindo %s!", user.toUpperCase()); // exibe usuário em maiúsculo.
        }
        else {
            System.out.println("Usuário ou Senha incorretos.");
        }
    }
}
