import java.util.Scanner;

public class Unid5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual o valor limite para pagar o pedágio? ");
        float valorPedagioLimite = teclado.nextFloat();
        
        int totalTrechosAcimaValor = 0;
        int totalTrechosInformados = 0;
        int totalTrechosAcima150 = 0;

        System.out.println("Informe o valor do pedágio e o km do percurso: ");
        float custo = teclado.nextFloat();
        while (custo >= 0) {
            int kmPercurso = teclado.nextInt();

            totalTrechosInformados++;

           /* if (custo > valorPedagioLimite) {
                totalTrechosAcimaValor++;
            }

            if (custo < valorPedagioLimite && kmPercurso > 150) {
                totalTrechosAcima150++;
            }
            */

            if (custo > valorPedagioLimite) {
                totalTrechosAcimaValor++;
            } else {
                if (kmPercurso >= 150) {
                    totalTrechosAcima150++;
                }
            }

            System.out.println("Informe o valor do pedágio e o km do percurso: ");
            custo = teclado.nextFloat();
        }
        teclado.close();

        System.out.println("Trechos com valor acima do qual ele nega-se a pagar: " +
            totalTrechosAcimaValor);
        System.out.println("Quantidade de trechos informados: " + totalTrechosInformados);
        System.out.println("Trechos acima de 150km com valor aceito por ele: " + totalTrechosAcima150);    
    }
}
