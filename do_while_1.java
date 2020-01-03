/**
 1. Write a program to enter a list of numbers. The list terminates when you enter the number as zero. Print the
total number of positive numbers, total number of negative numbers, sum of positive even numbers and sum of
negative odd numbers.
 */

import java.util.*;
public class do_while_1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int pos=0,neg=0;double sumposeven=0,sumnegodd=0,n;
    System.out.println("Enter a list of numbers. Enter 0 to terminate the list.");
     do
     {
      n=in.nextInt();
       if(n>0)
       {
        pos++;
         if(n%2==0)
         sumposeven+=n;
       }
       else if(n<0)
       {
        neg++;
         if(n%2!=0)
         sumnegodd+=n;
       }
     }
     while(n!=0);
    System.out.println("List Terminates.");
    System.out.println("Number of positive numbers: "+pos);
    System.out.println("Number of negative numbers: "+neg);
    System.out.println("Sum of positive even numbers: "+sumposeven);
    System.out.println("Sum of negative odd numbers: "+sumnegodd);
  }
}

/** Description Table:

 *      VARIABLE                      DATA TYPE                          DESCRIPTION
 
 *        pos                          double                      - to store the number of positive numbers entered.
 *        neg                          double                      - to store the number of negative numbers entered.
 *    sumposeven                       double                      - to store the sum of positive even numbers.
 *    sumnegodd                        double                      - to store the sum of negative odd numbers.
 *        n                            double                      - to store the inputted number. 
 */