package evaluator;

public class primoPalindromo extends Numero{
    // -------- Atributos ---------------
    private boolean esPrimo;
    private boolean esPalindromo;

    //----------- Constructor ------------
    public primoPalindromo(int valor) {
        super(valor);
        this.esPrimo = esPrimo(valor);
        this.esPalindromo = esPalindrome(valor);
    }

    //--------- Metodos -----------------
    private boolean esPrimo(int number){
        if (number == 1) return false;
        if (number==2 || number==3) return true;

        for(int i=2; i <number/2; i++){
            if (number%i == 0) return false;
        }

        return true;
    }

    private boolean esPalindrome(int number){
        int reves = voltear(number);

        if(reves == number) return true;
        return false;
    }

    private int voltear(int number){
        int reves=0;

        while(number != 0){
            reves = (reves*10) + (number%10);
            number = number/10;
        }

        return reves;
    }

    public boolean isEsPrimo() {
        return esPrimo;
    }

    public boolean isEsPalindromo() {
        return esPalindromo;
    }
}
