/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Student
 */
public class Vowels1 {

    public static void main(String[] args) throws IOException {

     
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter ur characters : ");
        char num = br.readLine().charAt(0);
       // if((num >='A' && num<='Z')||(num>='a'&& num<='z'))
        {
           // System.out.println("an alphabets ");
            {
 
 
                if(num=='a'|| num=='e'|| num=='i'|| num=='o'|| num=='u'|| num=='A'|| num=='E'|| num=='I'|| num=='O'|| num=='U')
                {
                    System.out.println(" vowel");
 
                }
                else
                {
                    System.out.println(" consonants");
 
                }
            }
        }
       /*else if(num ==' '|| num=='_'|| num=='@'|| num=='#'|| num=='$'|| num=='%'|| num =='&'|| num=='*'|| num=='~')
 
        {
            System.out.println(" special characters");
        }
        else if(num=='0'|| num=='1'|| num=='2'|| num=='3'|| num=='4'|| num=='6'|| num=='7'|| num=='8'|| num=='9')
        {
        System.out.println(" digits");*/
    }
}}
