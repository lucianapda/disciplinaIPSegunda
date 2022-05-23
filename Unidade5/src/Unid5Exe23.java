import java.util.Scanner;

public class Unid5Exe23 {
    /*
     * Uma grande loja de departamentos paga aos vendedores um salário com base nas
     * vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço
     * de cada produto vendido. Cada vendedor, em um determinado mês, vende n
     * produtos, onde, para cada produto tem-se o preço unitário e a quantidade
     * vendida. O departamento de pessoal deseja obter um relatório com: nome, total
     * de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere
     * o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve
     * apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor:
     * s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser
     * informado.
     * 
     */
    public static void main(String[] args) {

        String relatorio = "";

        Scanner s = new Scanner(System.in);
        System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
        String resposta = s.next();

        while (resposta.trim().equalsIgnoreCase("S")) {

            //variáveis do vendedor:
            System.out.print("Nome do vendedor: ");
            String nome = s.next();
            
            float salarioTotal = 0;
            float totalVendas = 0;

            System.out.print("Quantos produtos foram vendidos? ");
            int qtdProduto = s.nextInt();

            float salario = 0;
            for (int i = 0; i < qtdProduto; i++) {
                System.out.print("Preço do produto: R$");
                float preco = s.nextFloat();
                System.out.print("Quantidade vendida: ");
                int qtdVenda = s.nextInt();

                totalVendas += (preco * qtdVenda);
                salario += (preco * qtdVenda) * 0.30f;
            }

            relatorio += nome + " Total vendas: R$" + totalVendas + " Salário R$" + salario + "\n";
            System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            resposta = s.next();
        }

        s.close();

        System.out.println(relatorio);
    }
}
