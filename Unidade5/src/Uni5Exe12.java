import java.util.Scanner;
public class Uni5Exe12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Entre com n: ");
    int n = teclado.nextInt();
    int numFloyd = 1;

    for (int linha = 1; linha <= n; linha++) {
      for (int coluna = 1; coluna <= linha;coluna++) {
        System.out.print(numFloyd+" ");
        numFloyd += 1;
      }
      System.out.println();
    }

    teclado.close();
  }
}
