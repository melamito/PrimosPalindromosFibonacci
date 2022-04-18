package evaluator;

public class Fibonacci extends primoPalindromo{
    //---------- atributos -------------
    private boolean esFibonacci;

    //--------- Constructor ------------
    public Fibonacci(int valor) {
        super(valor);
        this.esFibonacci =  esFibonacci(valor);
    }

    //--------- Metodos -------------
    private boolean esFibonacci(int valor){
        int n1=0, n2=0, n3=1;

        while(n3 < valor){
            n1=n2;
            n2=n3;
            n3 = n1+n2;

            if (n3 == valor) return true;
        }
        return false;
    }

    public void mostrar(){
        System.out.print("El numero "+super.valor);
        boolean coma=false;

        if (isEsPrimo()){
            System.out.print(" es primo");
            coma= true;
        }

        if(isEsPalindromo()){
            if (coma){
                System.out.print(",");
            }
            System.out.print(" es palindromo");
            coma= true;
        }

        if (esFibonacci){
            if (coma){
                System.out.print(",");
            }
            System.out.print(" pertenece a Fibonacci");
            coma = true;
        }

        if(!coma){
            System.out.println(" No es primo, palindrome ni pertenece a Fibonacci");
        }
    }
}
