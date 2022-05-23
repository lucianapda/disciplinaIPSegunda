public class Vetor {
    
    public static void main(String[] args) {

        int numeros[] = new int[5];  
        
        int quantidade = 10;
        String[] nomes = new String[quantidade];
        nomes[0] = "Pedro";

        numeros[0] = 10;
        numeros[1] = 9;

        System.out.println("Valores: " + numeros[0] + " " +
            numeros[1] + " " + numeros[2]);

        for (int i = 0 ; i < 5; i++) {
            numeros[i] = i+1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
