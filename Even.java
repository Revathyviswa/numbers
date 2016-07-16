/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s;
    s=sc.nextInt();
    if(s%2==0)
       
    {
        System.out.println("it is even");
    }
    else
    {
        System.out.println("it is odd");
    }
    }
}
