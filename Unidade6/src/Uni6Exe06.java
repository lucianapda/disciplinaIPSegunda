import java.util.Scanner;

public class Uni6Exe06 {

  private Uni6Exe06() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o tamanho do vetor: ");
    final int vetQtd = teclado.nextInt();
    double vetor[] = new double[vetQtd];

    vetorLer(vetor, teclado);
    if (vetorPesquisar(vetor, teclado)) {
      System.out.println("Encontrou o valor");
    } else {
      System.out.println("Não encontrou o valor");
    }

    teclado.close();
  }

  private void vetorLer(double vetor[], Scanner teclado) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }
  }

  private boolean vetorPesquisar(double vetor[], Scanner teclado) {
    System.out.println("Informe um valor de pesquisa: ");
    double valorPesquisa = teclado.nextDouble();
    for (int i = 0; i < vetor.length; i++) {
      if (valorPesquisa == vetor[i]) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new Uni6Exe06();
  }

}
