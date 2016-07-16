/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
         b=sc.nextInt();
          c=sc.nextInt();
        
      if(a>b)
      {
          System.out.println("a is greater");
        
    }else if(b>c)
      {
          System.out.println("b is greater");
      }
      else 
      {
          System.out.println("c is greater"); 
      }
    }
}
