import java.util.Scanner;

public class ExemploCalculadora {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double numero1 = 0;
    char operador;
    double numero2 = 0;
    double resultadoValor = 0;
    boolean resultadoImprime;

    // Menu
    char opcao;
    do {
// rotina
      System.out.println(" Entre com 1a termo: ");
      numero1 = teclado.nextInt();
      System.out.println(" _ Entre com a opção: ");
      System.out.println(" ___ Soma          [+]");
      System.out.println(" ___ Subtração     [-]");
      System.out.println(" ___ Multiplicação [*]");
      System.out.println(" ___ Divisão       [/]");
      operador = teclado.next().charAt(0);
      System.out.println(" Entre com 2a termo: ");
      numero2 = teclado.nextInt();
      resultadoImprime = true;
      switch (operador) {
        case '+':
          resultadoValor = numero1 + numero2;
          break;
        case '-':
          resultadoValor = numero1 - numero2;
          break;
        case '*':
          resultadoValor = numero1 * numero2;
          break;
        case '/':
          if (numero2 != 0) {
            resultadoValor = numero1 / numero2;
          } else {
            resultadoImprime = false;
            System.out.println("Divisão por zero!!!");
          }
          break;
        default:
          resultadoImprime = false;
          System.out.println("Simbolos Incorreto!!!");
          break;
      }
      if (resultadoImprime) {
        System.out.println("Resultado: " + resultadoValor);
      }
// - rotina
      System.out.println("Deseja continuar (s/n)? ");
      opcao = teclado.next().charAt(0);
    } while (opcao == 's');

    teclado.close();
  }
}
