package evaluator;

public class Primo implements Evaluator{

    public boolean verifyNumber(int value){
        return verifyPrimo(value);
    }

    public boolean verifyPrimo(int value){
        showPrimo();
        return true;
    }

    public void showPrimo(){
        System.out.println("evaluating Primo");
    }
}
