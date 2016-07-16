/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the alpahbet");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            System.out.println("character is alphabet");
        }
        else
        {
            System.out.println("the character is not an alphabet");
        }
        
        
    }
}
