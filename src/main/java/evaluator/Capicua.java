package evaluator;

public class Capicua implements Evaluator {

   public boolean verifyNumber(int value){
       return verifyCapicua(value);
   }

   public boolean verifyCapicua(int value){
       showCapicua();
       return true;
   }

   public void showCapicua(){
       System.out.println("evaluating Capicua");
   }
}
