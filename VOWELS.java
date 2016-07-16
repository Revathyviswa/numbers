/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class VOWELS {
    private static char ch;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a consonant");
        }
    }
}
