import java.util.Scanner;

public class Unid5Exe30 {

    /*
     * Implemente o problema da mochila. Tendo-se uma sequência decrescente de
     * números inteiros positivos que inicia em N, com decremento inteiro positivo
     * K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se
     * coloque dentro dela preferencialmente os maiores valores, até que ela esteja
     * cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um
     * algoritmo que imprima:
     * 
     * os elementos a serem colocados na mochila;
     * os elementos que entraram na mochila;
     * os que ficaram fora da mochila;
     * qual é a soma dos elementos que entraram na mochila;
     * qual a soma dos elementos que não entraram na mochila.
     */

    public static void main(String[] args) {

        int m, n, k;
        String elementosMochila = "";
        String elementosFora = "";
        int somaMochila = 0;
        int somaFora = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor para iniciar o decremento: ");
        n = s.nextInt();

        System.out.print("Digite o valor para o decremento: ");
        k = s.nextInt();

        System.out.print("Digite o tamanho da mochila: ");
        m = s.nextInt();

        int quantidade = 0;
        while (quantidade < m) {
            elementosMochila += n + " ";
            somaMochila += n;
            
            n = n - k; //atualização do valor
            
            quantidade++;
        }

        while (n >= 0) {
            elementosFora += n + " ";
            somaFora += n;

            n = n - k;
        }

        System.out.println("Mochila " + elementosMochila);
        System.out.println("Soma mochila " + somaMochila);
        System.out.println("Fora mochila " + elementosFora);
        System.out.println("Soma fora " + somaFora);
        s.close();
    }
}
