import java.util.Scanner;

public class CheckingPasscodes {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean hasDigit;
      String passCode;

      hasDigit = false;
      passCode = scnr.next();

      /* Your solution goes here  */
      char let0 = passCode.charAt(0);
      char let1 = passCode.charAt(1);
      char let2 = passCode.charAt(2);
      if(passCode.length() > 0 && (Character.isDigit(let0) || Character.isDigit(let1) || Character.isDigit(let2))){
         hasDigit = true;
      }

      if (hasDigit) {
         System.out.println("Has a digit.");
      }
      else {
         System.out.println("Has no digit.");
      }
   }
}
