import java.util.Scanner;

public class Uni6Exe01 {

  private Uni6Exe01() {
    int vetor[] = new int[10];

    // Método: Ler
    vetorLer(vetor);

    // Método: Escrever
    vetorImprimirOrdemInversa(vetor);
  }

  private void vetorLer(int vetor[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Método: Ler");
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
      vetor[i] = teclado.nextInt();
    }

    teclado.close();
  }

  private void vetorImprimirOrdemInversa(int vetor[]) {
    System.out.println("Método: Escrever");
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe01();
  }

}
