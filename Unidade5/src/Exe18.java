import java.util.Scanner;

/* Foi feita uma pesquisa de audiência de canal de TV em n casas
 de um determinado bairro de uma cidade, em um certo dia do mês. 
 Na pesquisa foi utilizado um coletor de dados portátil. Para cada
  casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e o 
  número de pessoas que estavam assistindo a TV naquele horário, 
  considerando que em cada casa só existia uma televisão. Em casas onde
   a televisão estava desligada, foi registrado zero para o número do canal 
   e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule 
   e escreva, para cada emissora, o percentual de audiência. A leitura deve 
   ser finalizada quando for informado canal 0. */

public class Exe18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;

        System.out.print("Digite o canal que está assistindo: 4,5,9,12: ");
        int canal = entrada.nextInt();
        while (canal != 0) {

            System.out.print("Quantas pessoas estão assistindo o canal? ");
            int quantidade = entrada.nextInt();

            switch (canal) {
                case 4:
                    canal4 += quantidade;
                    break;
                case 5:
                    canal5 += quantidade;
                    break;
                case 9:
                    canal9 += quantidade;
                    break;
                case 12:
                    canal12 += quantidade;
                    break;
                default: System.out.println("Canal inválido");
            }

            System.out.print("Digite o canal que está assistindo: 4,5,9,12: ");
            canal = entrada.nextInt();
        }

        double total = canal4 + canal5 + canal9 + canal12;
        double percentualCanal4 = (canal4 / total) * 100;
        double percentualCanal5 = (canal5 / total) * 100;
        double percentualCanal9 = (canal9 / total) * 100;
        double percentualCanal12 = (canal12 / total) * 100;

        System.out.println("Percentual de audiência nos canais: \n"+ 
                "Canal 4 - " + percentualCanal4 + "\nCanal 5: " +
                percentualCanal5 + "\nCanal 9: " + percentualCanal9 +
                "\nCanal 12: " + percentualCanal12);
        entrada.close();
    }
}
