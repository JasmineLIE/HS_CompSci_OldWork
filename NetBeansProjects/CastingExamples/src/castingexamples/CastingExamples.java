/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingexamples;

/**
 *
 * @author hwafu
 */
public class CastingExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String aString = "100";
       String bString = "99.999";
       
       double aDouble = 7.785;
       double bDouble = Double.parseDouble(bString);
       int aInteger = Integer.parseInt(aString);
       
       double cDouble = (double) aInteger;
       
       String cString = Integer.toString(aInteger);
       String dString = Double.toString(cDouble);
       
        System.out.println("This is the first String:" + aString);
        System.out.println("This is the second String: " + bString);
        System.out.println("This is the first Double: " + aDouble);
        System.out.println("This is a Double variable from the second String: " + bDouble);
        System.out.println("This is an Integer from the first string: " + aInteger);
        System.out.println("This is a Double from a casted Integer: " + cDouble);
        System.out.println("This is an Integer converted to a String: " + cString);
        System.out.println("This is a Double converetd to a String: " + dString );
    }
    
}
