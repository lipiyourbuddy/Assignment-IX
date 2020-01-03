/**
 5. Write a menu driven program to find the sum of the following series depending on the user choosing 1 or 2
    1. S=1/4+1/8+1/12.........upto n terms
    2. S=a/1! - a^2/2! + a^3/3!.......upto n terms
       where ! stands for factorial of the number and the factorial value of a number is the
       product of all integers from 1 to that number, e.g. 5! = 1 2 3 4 5.(use switch-case).
 */
import java.util.*;
public class switch_case_5
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your choice to find the sum of any of the following series:\n1. Series: 1/4+1/8+1/12+...\n2. Series: a/1!-a^2/2!+a^3/3!+...a^n/n!");
    int ch=in.nextInt();
    System.out.println("Enter the number of terms");
    int t=in.nextInt(); double s=0;
    switch(ch)
    {
      case 1:
      int e=4;
      for(int i=1;i<=t;i++)
      {
        
        s=s+1.0/e;
        e+=4;
      }
      System.out.println("Sum of the series: "+s);
      break;
      
      case 2:
      System.out.print("Enter the value of a: ");
      double a=in.nextInt(),sum=0;
      System.out.println();
      for(int i=1; i<=t;i++)
      {
         int f=1;
         for(int r=1;r<=i;r++)
          f=f*r;
         if (i%2==0)
          sum=sum-(double)(Math.pow(a,i)/f);
         else
          sum=sum+(double)(Math.pow(a,i)/f);
         
      }
      System.out.print("Sum of the Series: "+sum);
      break;
      
      default:
      System.out.println("Wrong choice!");

      
    }
 }
}

/** Description Table:
 
 *       VARIABLE                          DATA TYPE                            DESCRIPTION
 
 *         ch                            integer (int)                      - to store the entered choice.
 *         t                             integer (int)                      - to store the number of terms.
 *         s                                double                          - to store the sum of the 1st series.
 *         e                             integer (int)                      - to use as halping control variable and a divisor.
 *         i                             integer (int)                      - to use as a control variable for both loops.
 *         a                                double                          - to store the value of the dividend (for the second series).
 *        sum                               double                          - to store the sum of the 2nd series.
 *         f                             integer (int)                      - to store the factorial of the number (i).
 *         r                             integer (int)                      - to use as a control variable for the inner loop.
 */