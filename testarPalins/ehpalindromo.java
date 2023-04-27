package testarPalins;

public class ehpalindromo extends palindromos{

    
    protected boolean ehPalindromo;
    
    
    public ehpalindromo(int numero) {
        super();
        this.ehPalindromo = EhPalindromo(numero);
    }

    
    public boolean EhPalindromo(int numero) {
        int numtemp = numero;
        int numlength = 0;
        while(numtemp!=0){
            numtemp/=10;
            numlength++;
        }
        int[] numext = new int[numlength];
        int resto = numero;
        for (int i = 0; i < numlength; i++){
            numext[i] = resto % 10;
            resto /= 10;
        }

        int o = 1;
        for (int i = 0; i < numlength/2; i++){
            if (numext[i]!=numext[numlength-(i+1)]){
                o=0;
            } 
        }

        if (0==1){
        return true;
        }else{
        return false;  
        }
    }

    



   
    
}
