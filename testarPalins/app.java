package testarPalins;

import javax.swing.JOptionPane;

public class app {

    

    public static void main(String[] args) {
        int palindromoslength = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números serão testados?"));
        palindromos palindromo = new palindromos(palindromoslength);
        int[] palindromoA = palindromo.getPalindromos();
        for (int i = 0; i < palindromoA.length; i++){
            JOptionPane.showMessageDialog(null, palindromoA[i] + " é o " + (i+1) + "° número palíndromo a partir do número setado anteriormente.");
        }

    }
}