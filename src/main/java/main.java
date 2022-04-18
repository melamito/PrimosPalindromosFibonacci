import evaluator.Fibonacci;
import evaluator.Evaluator;
import evaluator.Primo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        int valor;
        Fibonacci number;
        Evaluator aux= new Primo();



        System.out.println("Ingrese un numero: ");
        valor = buffer.nextInt();

        aux.verifyNumber(valor);

        /*number = new Fibonacci(valor);
        number.mostrar();
        */
    }
}
