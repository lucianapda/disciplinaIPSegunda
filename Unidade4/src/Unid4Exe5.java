import java.util.Scanner;

public class Unid4Exe5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = s.nextBoolean();
        String resposta2 = s.next();

        if (resposta) { //== true
            System.out.println("Sim");
        } else {
            System.out.println("Não ");
        }


        //se a resposta tem o texto IGUAL a "Sim"
        //if (resposta2.equals("Sim")) { 

        //se a resposta tem o mesmo conteúdo que "Sim"
        //"   Sim   " -> trim() - > "Sim"
        if (resposta2.trim().equalsIgnoreCase("Sim")) {     
            System.out.println("A cor é azul");
        } else {
            System.out.println("Não é azul");
        }
        s.close();
    }
}
