import java.util.Scanner;

public class Unid4Exe6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite M, F, I ");
        String letra = s.nextLine();
        letra = letra.toUpperCase();
        char letraChar = letra.trim().charAt(0);
        //char l = s.nextLine().toUpperCase().trim().charAt(0);

        if (letraChar == 'M') {
            System.out.println("Masculino");
        } else if (letraChar == 'F') {
            System.out.println("Feminino");
        } else if(letraChar == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Incorreta");
        }

        s.close();
    }
}
