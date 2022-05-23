import java.util.Scanner;

public class Unid5Exe32 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o dia para iniciar a semana: ");
        int diaInicial = s.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        int qtdDias = s.nextInt();


        int dia = 1;
        int diaSemana = 1;
        //Alinhar o calendário:
        while (diaSemana < diaInicial) {
            System.out.print("\t");
            diaSemana++;
        }

        //Popula o calendário:
        while (dia <= qtdDias) {
            while (diaSemana <= 7 && dia <= qtdDias) {
            //for (int i = diaSemana; i <= 7; i++) {
              //  if (dia <= qtdDias) {
                System.out.print(dia + "\t");
                dia++;
                diaSemana++;
            }
            diaSemana = 1;
            System.out.println("");

        }

        s.close();
    }
}
