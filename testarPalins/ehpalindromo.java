package testarPalins;

public class ehpalindromo {

    public static boolean ehPalindromo(int numero) {
        int numeroInvertido = 0;
        int resto;
        int aux = numero;
        while (aux > 0) {
            resto = aux % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            aux = aux / 10;
        }
        return numero == numeroInvertido;
    }
      
}