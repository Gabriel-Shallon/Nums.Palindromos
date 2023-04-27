package testarPalins;

import javax.swing.JOptionPane;

public class app{

    public static void main(String[] args) {
        

        palindromos callpalins = new palindromos();
        int[] palindromoA = callpalins.PrimeirosPalindromos();
        for (int i = 0; i < palindromoA.length; i++){
            JOptionPane.showMessageDialog(null, palindromoA[i]+" é o "+(i+1)+"° número palindromo a partir de "+(palindromoA.length-palindromoA[0]));
        }
    }
}

