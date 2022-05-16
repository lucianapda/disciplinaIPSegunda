import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        int canal = 0;

        do {
            System.out.print("Digite o canal 4, 5, 9 ou 12: ");
            canal = s.nextInt();
        } while (canal != 4 && canal != 5 && canal!=9 && canal != 12);

        System.out.println("Sai do laço");

        s.close();

    }
}
