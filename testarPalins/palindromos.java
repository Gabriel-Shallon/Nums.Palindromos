package testarPalins;

import javax.swing.JOptionPane;

public class palindromos extends ehpalindromo {
    
    private int[] palindromos;
    private int iniciNum;

    public palindromos(int palindromoslength) {
        this.palindromos = primeirosPalindromos(palindromoslength);
    }
    
    public int[] primeirosPalindromos(int palindromoslength) {
        int[] palindromos = new int[palindromoslength];
        iniciNum = Integer.parseInt(JOptionPane.showInputDialog(null, "A partir de qual número irá descobrir os primeiros " + palindromos.length + " palíndromos?"));
        int passVet = 0;

        while (passVet != palindromos.length) {
            int numero = iniciNum + passVet;
            if (ehPalindromo(numero)) {
                palindromos[passVet] = numero;
                passVet++;
            }
            else {
                iniciNum++;
            }
        }
        return palindromos;
    }

    public int[] getPalindromos() {
        return palindromos;
    }
}