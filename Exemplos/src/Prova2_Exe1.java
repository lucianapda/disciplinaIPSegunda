import java.util.Scanner;

public class Prova2_Exe1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalHospedes = 0;

        int opcao = 0;
        do {
            System.out.println("--- Controle de hospedes ----");
            System.out.println("1. encerrar a conta de um hospede");
            System.out.println("2. verificar numero de contas encerradas");
            System.out.println("3. sair");
            System.out.print("__opcao:");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("-Hospede-");
                    System.out.print("Nome: ");
                    String nome = s.next();
                    System.out.print("Diarias: ");
                    int diarias = s.nextInt();

                    float preco = 10 * diarias;
                    if (diarias < 7) {
                        preco += 7.3f;
                    } else if (diarias == 7) {
                        preco += 6.3f;
                    } else {
                        preco += 5.3f;
                    }

                    //Saída:
                    System.out.println("-------");
                    System.out.println("Nome: " + nome);
                    System.out.println("Total: " + preco);

                    totalHospedes++;
                    break;
                case 2:
                    System.out.println("__Numero contas encerradas: " + totalHospedes);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcao errada!");
            }

        } while (opcao != 3);

        s.close();
    }
}
