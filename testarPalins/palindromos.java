package testarPalins;

import javax.swing.JOptionPane;

public class palindromos{
    
    protected int numero;
    protected int[] palindromos = new int[Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números serão testados?"))];
    

    public palindromos() {
        this.palindromos = PrimeirosPalindromos();
    }

    
    public int[] PrimeirosPalindromos(){
        int iniciNum = Integer.parseInt(JOptionPane.showInputDialog(null, "A partir de qual número irá descobrir os primeiros "+palindromos.length+" palindromos?"));
        int passVet = 0;

        while ( passVet != palindromos.length){
            numero = iniciNum+passVet;
            ehpalindromo palin = new ehpalindromo(numero); 
            
            if (palin.EhPalindromo(numero) == true){
                palindromos[passVet] = numero;
                passVet++;
            }
        }
        
        return palindromos;
    }


    
}
