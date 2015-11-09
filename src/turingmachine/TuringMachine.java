/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

import java.util.Scanner;

/**
 *
 * @author Aust1_000
 */
public class TuringMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n =0, m=0;
        
        Scanner sc = new Scanner(System.in);
        
        
        
        
        System.out.println("Please enter the number of a's and c's or n:");
        n = sc.nextInt();
        System.out.println("Please enter the number of b's or m:");
        m = sc.nextInt();
        char result[] = new char[2*n + m];
        
        for(int i =0; i < (2*n+m); i++)
        {
            if(i < n)
                result[i] = 'a';
            if(i >= n && i < (n + m) )
                result[i] = 'b';
            else if(i >= (n+m))
                result[i] = 'c';
            System.out.print(result[i]);
        }
            
        
        // TODO code application logic here
    }
    
}
