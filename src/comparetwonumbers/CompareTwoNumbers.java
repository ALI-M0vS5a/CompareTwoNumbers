/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetwonumbers;

import java.util.Scanner;

/**
 *
 * @author LAU
 */
public class CompareTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int a = input.nextInt();
        System.out.println("Input second integer: ");
        int b = input.nextInt();
        if(a==b){
            System.out.println("both are equal");
        }else if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is greater than a");
        }
        
    }
    
}
