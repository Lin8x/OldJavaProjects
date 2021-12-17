import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 * Steganography class for Activity 4
 * modified for rm 419
 *
 * Only the additional methods are included in this class.
 */
public class Steganography2 {

    /**
      * Takes a string consisting of capital letters and spaces and
      * encodes the string into an arraylist of integers.
      * The integers are 1-26 for A-Z, and 27 for space.
	    * The last element in the list MUST BE 0
      * The arraylist of integers is returned.
      * @param s string consisting of capital letters and spaces
      * @return arraylist containing integer encoding of s
      */
     public static ArrayList<Integer> encodeString(String s)
     {
        Arraylist <String> arr = new ArrayList <String> ();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        arr.add("G");
        arr.add("H");
        arr.add("I");
        arr.add("J");
        arr.add("K");
        arr.add("L");
        arr.add("M");
        arr.add("N");
        arr.add("O");
        arr.add("P");
        arr.add("Q");
        arr.add("R");
        arr.add("S");
        arr.add("T");
        arr.add("U");
        arr.add("V");
        arr.add("W");
        arr.add("X");
        arr.add("Y");
        arr.add("Z");
        arr.add(" ");
        ArrayList <Integer> integ = new ArrayList <Integer> ();
        for(int i = 0; i < s.length(); i++){
          int r = arr.indexOf(s.substring(i, i+1))+1;
          integ.add(r);
        }
        return integ;
     }
     
     /**
       * Returns the string represented by the codes arraylist.
       * 1-26 = A-Z, 27 = space (Integers in [1,27])
       * @param codes encoded string
       * @return decoded string
       */

     public static String decodeString(ArrayList<Integer> codes){
        String sum = "";
        Arraylist <String> arr = new ArrayList <String> ();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        arr.add("G");
        arr.add("H");
        arr.add("I");
        arr.add("J");
        arr.add("K");
        arr.add("L");
        arr.add("M");
        arr.add("N");
        arr.add("O");
        arr.add("P");
        arr.add("Q");
        arr.add("R");
        arr.add("S");
        arr.add("T");
        arr.add("U");
        arr.add("V");
        arr.add("W");
        arr.add("X");
        arr.add("Y");
        arr.add("Z");
        arr.add(" ");
        for(int i = 0; i < codes.length; i++){
          sum = sum + arr.get(codes.get(i));
        }
        return sum;
     }
     
     /**
       * Given a number from 0 to 63, creates and returns an
       * int array of 3 ints consisting of the integers
       * representing the pairs of bits in the number from right to left.

Any number from 0-63 can be represented with 6 bits.  Each element in the array represents the integer value of a pair of bits.  Here is an example:
     num = 30  which is 011110 in binary.  
     012= 1, 112=3, 102=2  so the array would be {1,3,2}

       * @param num number to be broken up
       * @return bit pairs in number
       */
     private static int[] getBitPairs(int num)
     {
        int [] bit = {0, 0, 0, 0, 0, 0,};
        if(num % 2 != 0){bit[0] = 1;}
        int index = 0;
        boolean check = false;
        while(index < bit.length || check == true){
          if(math.pow(2, index)>num){
            check = true;
          }
          index++;
        }
        for(int i = 0; i < bit.length; i++){}
        //ill be afterschool to talk about this

         // 0 0 0 0 0
     }

/**Sets the two lowest bits of each byte in p to the corresponding int in arr.
     * The first value in the array is used in the red byte, 
     * second value is used in the green byte, and the third
     * value is used in the blue byte.
     * @param p isn't null
     * @param arr is an array of 3 elements. 
     */
    public static void setLow(Pixel p, int[] arr){
      int secLastDigit = p.
      p.setRed((p.getRed()/4)*4);
      p.setBlue((p.getBlue()/4)*4);
      p.setGreen((p.getGreen()/4)*4);
        
    }




    /*Calculates and returns the integer hidden in the p.  The
     * last two bits of each color byte in p hold part of a six bit number.
     * The highest two bits are in red, the middle bits are in green, and
     * the lowest bits are in blue.
     */
    public static int calcValue(Pixel p){
    	
        
    }
    /**
     * Hide a string (must be only capital letters and spaces) in a
     * picture.
     * The string always starts in the upper left corner.
     * @param source picture to hide string in
     * @param s string to hide
     * @return pic with hidden string
     */
    public static Picture hideText(Picture source, String s){

    }
    
    /**
      * Returns a string hidden in the picture
      * @param source picture with hidden string
      * @return revealed string
      */

     public static String revealText(Picture source){


         
       
      }

    public static void main(String[] args) {
       // Activity 4.4
       Picture beach = new Picture("beach.jpg");
       beach.explore();
       Picture hiddenText = hideText(beach,"THIS IS A TEST");
       hiddenText.explore();
       String reveal = revealText(hiddenText);
       if(reveal.equals("THIS IS A TEST"))
       {
           System.out.println("It worked!");
       }
       else 
       {
           System.out.println("Something went wrong!");
       }


       
    }
}
