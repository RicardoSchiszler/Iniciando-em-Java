// Código usado via terminal utilizando "args" da main como parâmetro.
public class Calculate {
    public static void main(String[] args){

        // Using parseDouble to convert a String to a number
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);

        //
        if(args[0].equals("somar")){
            sum(x, y);
        }
        else if(args[0].equals("subtrair")){
            minus(x,y);
        }
        else if (args[0].equals("dividir")){
            division(x,y);
        }
        else if(args[0].equals("multiplicar")){
            multiplication(x,y);
        }
        else if(args[0].equals("resto")){
            remainder(x,y);
        }
        else{
            System.out.println("Nenhuma operação válida.");
        }
    }

    static void sum(double x, double y){
        System.out.println(x + y);
    }

    static void minus(double x, double y){
        System.out.println(x - y);
    }
    static void division(double x, double y){
        System.out.println(x / y);
    }
    static void multiplication(double x, double y){
        System.out.println(x * y);
    }
    static void remainder(double x, double y){
        System.out.println(x % y);
    }

}
