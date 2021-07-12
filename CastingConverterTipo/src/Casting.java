import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        // converter tipos primitivos
        // (casting)

        Scanner input = new Scanner(System.in);
        double dd = 10.10;
        short ss = 32;

        float x = (float) dd / ss; // converte para float, é necessario inserir entre parentes após o igual
        int y = (int) dd / ss; // converte para int

        int z = (int) input.nextDouble();


        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}
