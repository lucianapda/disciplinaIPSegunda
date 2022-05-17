import java.util.Scanner;

/*Em uma eleição para presidência, existem 4 candidatos. 
Os votos são informados através de código. Os dados utilizados para
 votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, 
emitir a mensagem “Opção incorreta” e persistir solicitando um número de 
opção correto. Para interromper a operação, o usuário poderá fornecer o número 0. */
public class Unid5Exe33 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulo = 0;
        int votosBranco = 0;
        int voto = 0;

        do {
            System.out.println("Digite seu voto: \n1, 2, 3, 4 - para candidato\n" +
                    "5 - nulo\n6 - branco\n0 - sair");
            voto = s.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }

        } while (voto != 0);

        /*
         * total de votos para cada candidato;
         * total de votos nulos;
         * total de votos em branco;
         * percentual dos votos em branco e nulos sobre o total.
         */

        System.out.println("Candidato 1: " + votosCandidato1 + "\nCandidato 2: " +
                votosCandidato2 + "\nCandidato 3: " + votosCandidato3 + "\nCandidato 4: " +
                votosCandidato4 + "\nNulos: " + votosNulo + "\nBranco: " + votosBranco);

        // totalBranco --- X
        // total --- 100%
        // X * total = totalBranco * 100
        // X = (totalBranco * 100) / total

        int total = votosCandidato1 + votosCandidato2 + votosCandidato3 +
                votosCandidato4 + votosBranco + votosNulo;

        float percentualBranco = (votosBranco * 100) / total;
        float percentualNulo = (votosNulo * 100) / total;

        System.out.println("Percentual branco: " + percentualBranco +
                "\nPercentual nulo: " + percentualNulo);
        s.close();

    }
}
