/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagevaluecalculator;

import java.util.Scanner;

/**
 *
 * @author hwafu
 */
public class AverageValueCalculator {

    /**
     * @param args the command line arguments
     */
    //stuff like += and != is a simpler way to make an equation with your stuff
    public static void main(String[] args) {
        final int SENTINEL = 0;
        int newValue;
        int numValues = 0;
        int sumOfValues = 0;
        double avg;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Calcuate Average Program");
        System.out.println("Enter value (" + SENTINEL + " to quit):");
        newValue = input.nextInt();
        
        while (newValue != SENTINEL) {
        numValues += 1;
        sumOfValues +=newValue;
            System.out.println("Enter a value (" + SENTINEL + " to quit):");
            newValue = input.nextInt();
        }
        input.close();
        avg = (double)sumOfValues / (double)numValues;
            System.out.println("Average is " + avg);
    }
        // TODO code application logic here
    }
    

