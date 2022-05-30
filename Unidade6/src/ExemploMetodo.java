import java.util.Scanner;

public class ExemploMetodo {

    // construtor
    public ExemploMetodo() {
        Scanner entrada = new Scanner(System.in);

        int[] informacoes = lerDados(entrada);
        int respota = calcular(0, 5, 6);
        imprimirValor(respota);
        
        //ordem: sinal, n1, n2
        respota = calcular(informacoes[2], informacoes[0], informacoes[1]);
        imprimirValor(respota);

        entrada.close();
    }

    public int[] lerDados(Scanner entrada) {
    
        int[] dados = new int[3];
        System.out.print("Digite o numero 1:");
        int n1 = entrada.nextInt();
        System.out.print("Digite o numero 2: ");
        int n2 = entrada.nextInt();
        System.out.print("Digite o sinal (+ = 0, - = 1, / = 2, * = 3): ");
        int sinal = entrada.nextInt();

        dados[0] = n1;
        dados[1] = n2;
        dados[2] = sinal;

       

        return dados;
    }

    public int calcular(int sinal, int num1, int num2) {
        // int resultado = 0;
        switch (sinal) {
            case 0:
                return num1 + num2;
            case 1:
                return num1 - num2;
            case 2:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Numero 2 não pode ser 0!");
                }
                break;

            case 3:
                return num1 * num2;
            default:
                System.out.println("sinal inválido");
        }
        return 0;
        // return resultado;
    }

    public void imprimirValor(int resultado) {
        System.out.println("Resultado = " + resultado);
    }

    public static void main(String[] args) {
        new ExemploMetodo();
    }
}