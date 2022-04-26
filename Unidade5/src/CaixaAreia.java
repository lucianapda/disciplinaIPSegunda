public class CaixaAreia {
	public static void main(String[] args) {
		int linha, coluna;
		linha = 1;
		while (linha <= 2) {
			coluna = 1;
			while (coluna <= 2) {
				System.out.println("["+linha+"/"+coluna+"]");
				coluna++;
			}
			linha++;
		}
	}
}
