import java.util.Scanner;

public class Prova2_Exe2 {

    private int[] soma;

    public Prova2_Exe2() {
        Scanner teclado = new Scanner(System.in);
        int[] vetA = ler(teclado, "A");
        int[] vetB = ler(teclado, "B");

        soma = somar(vetA, vetB);
        ordenar();
        escrever();
        teclado.close();
    }

    public void escrever() {
        System.out.println("--- Resultado ---");
        for (int i = 0; i < soma.length; i++) {
            System.out.println("VetSoma[" + i + "]: " + soma[i]);
        }
    }
    public void ordenar() {
        int bolha;
        for (int i = 0; i < soma.length - 1; i++) {
          if (soma[i] > soma[i + 1]) {
            bolha = soma[i];
            soma[i] = soma[i + 1];
            soma[i + 1] = bolha;
            i = -1;
          }
        }
       // return vetor;
    }

    public int[] ler(Scanner s, String nome) {
        int[] vetor = new int[4];

        System.out.println("___ Lendo o Vet" + nome + "____");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vet" + nome + "[" + i + "]: ");
            vetor[i] = s.nextInt();
        }

        return vetor;
    }

    public int[] somar(int vetA[], int vetB[]) {
        int soma[] = new int[vetA.length];

       // int aux = vetA.length-1;
        for (int i = 0; i < vetA.length; i++) {
            soma[i] = vetA[i] + vetB[vetA.length - i - 1];
            
           // soma[i] = vetA[i] + vetB[aux];
            //  aux--;
        }

        return soma;
    }

    public static void main(String[] args) {
       new Prova2_Exe2(); 
    }
}
