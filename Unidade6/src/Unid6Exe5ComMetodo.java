import java.util.Scanner;

public class Unid6Exe5 {

    // Crie um método que possa ler tanto as respostas do rapaz como da moça
    // outro para calcular e retornar a afinidade.

    public String[] lerRespostas(Scanner s) {

        String resposta[] = new String[5];
        String[] perguntas = { "Gosta de música sertaneja? ",
                "Gosta de futebol? ", "Gosta de seriados? ",
                "Gosta de redes sociais? ", "Gosta da Oktoberfest? " };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i]);
            // String resposta = s.next();
            resposta[i] = s.next();
        }
        return resposta;
    }

    public int retornarAfinidade(String respostaMoca[], String respostaRapaz[]) {
        int afinidade = 0;

        for (int i = 0; i < 5; i++) {
            // São iguais:
            if (respostaMoca[i].trim().equalsIgnoreCase(respostaRapaz[i])) {
                afinidade += 3;
            } else if ((respostaMoca[i].trim().equalsIgnoreCase("Sim") &&
                    respostaRapaz[i].trim().equalsIgnoreCase("Nao")) ||
                    (respostaMoca[i].trim().equalsIgnoreCase("Nao") &&
                            respostaRapaz[i].trim().equalsIgnoreCase("Sim"))) {
                afinidade -= 2;
            } else {
                afinidade += 1;
            }
        }
        return afinidade;
    }
    public Unid6Exe5() {
        Scanner s = new Scanner(System.in);

        String respostaMoca[] = lerRespostas(s);
        String[] respostaRapaz = lerRespostas(s);

        int afinidade = retornarAfinidade(respostaMoca, respostaRapaz);

        /*
         * 15 “Casem!
         * 10 a 14 “Vocês têm muita coisa em comum!”
         * 5 a 9 “Talvez não dê certo :(”
         * 0 a 4 “Vale um encontro.”
         * -1 a -9 “Melhor não perder tempo”
         * -10 “Vocês se odeiam!”
         */

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Voces tem muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez nao de certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor nao perder tempo");
        } else {
            System.out.println("Voces se odeiam!");
        }
        s.close();
    }

    public static void main(String[] args) {
        new Unid6Exe5();
    }

}
