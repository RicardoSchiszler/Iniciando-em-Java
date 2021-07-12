import java.util.Locale;

public class ManipularString {

    public static void main(String[] args){
        String x = "Olá mundo! Esse é o novo mundo";
        System.out.println(x);// exibe a string original
        System.out.println(x.length()); // retorna a quantidade de caracteres de uma string
        System.out.println(x + " concatenada"); // conteudo de x concatenado com outra frase
        System.out.println(x.contains("novo")); // retorna se a string contem ou não o caractere/palavra/frase inserida
        System.out.println(x.indexOf("mundo")); // retorna onde começa a palavra procurada
        System.out.println(x.lastIndexOf("mundo")); // retorna onde começa a ultima sentença da palavra (ultima vez que ocorreu)
        System.out.println(x.toUpperCase()); // transforma tudo em MAÍSCULO
        System.out.println(x.toLowerCase()); // TRANSFORMA TUDO EM minúsculo
        System.out.println(x.trim()); // remove espaços desnecessários da String (EX: espaços antes do e-mail)
        System.out.println(x.substring(9)); // pega a partir da posição indicada

        System.out.println(x.equals("ola")); // compara strings

    }
}
