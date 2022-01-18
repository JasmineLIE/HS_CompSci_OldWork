/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphaorder;

import java.util.Scanner;

/**
 *
 * @author hwafu
 */
public class AlphaOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word1, word2;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        word1 = Input.nextLine();
        System.out.println("Enter a second word: ");
        word2 = Input.nextLine();
        Input.close();
        
        if (word1.compareToIgnoreCase(word2) == 0) {
            System.out.println("The words are equal");
        }
        else if (word1.compareToIgnoreCase(word2) < 0) {
            System.out.println("In alphabetical order:" + word1 + " " + word2);
        } else {
            System.out.println("In alphabetical order: " + word2 + " " + word1);
              
        }
        // TODO code application logic here
    }
    
}
