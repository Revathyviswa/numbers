/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class NUMBERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s;
    s=sc.nextInt();
    if(s>=0)
       
    {
        System.out.println("it is positive"+s);
    }
    else
    {
        System.out.println("it is negative"+s);
    }
}}
