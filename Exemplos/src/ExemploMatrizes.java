import java.util.Scanner;

public class ExemploMatrizes {
    
    public ExemploMatrizes() {
        Scanner s = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        for (int col = 0; col < matriz.length; col++) {
            for (int lin = 0; lin < matriz[col].length; lin++) {
                System.out.print("Matriz[" + col + "][" + lin +"]: ");
                matriz[col][lin] = s.nextInt();
            }
        }


        for (int col = 0; col < matriz.length; col++) {
            for (int lin = 0; lin < matriz[col].length; lin++) {
                System.out.print("Matriz[" + col + "][" + lin +"]: " + matriz[col][lin]);
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        new ExemploMatrizes();
    }
}
