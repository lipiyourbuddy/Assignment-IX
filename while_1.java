/**
 1. A special number is such that when the sum of its digits is added to the product of its digits, the result is
equal to the original number.
Example: Consider the number 59.
Sum of digits = 5 + 9 = 14
Product of its digits = 5 x 9 = 45
Sum of the sum of digits and product of digits = 14 + 45 = 59

Write a program to accept a number. Add the sum of its digits to the product of its digits. If the value is equal to the
number input, output the message "Special number" otherwise, output the message "Not a Special number".
 */

import java.util.*;
public class while_1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number to check whether it is a special number or not: ");
    int n=in.nextInt();
    int temp=n,temp2=n,sum=0,pr=1,d=0,f=0,sum2=0;
    while(n!=0)
    {
     d=n%10;
     sum=sum+d;
     n=n/10;
    }
    while(temp!=0)
    {
     f=temp%10;
     pr=pr*f;
     temp=temp/10;
    }
    sum2=sum+pr;
    if(sum2==temp2)
    System.out.println("Special Number.");
    else
    System.out.println("Not a Special Number.");
  }
}

/** Description Table:
 
 *   VARIABLE                            DATA TYPE                            DESCRIPTION
 *      n                                  int                            - to store the inputted number
 *  temp,temp2                             int                            - to store the number in other variables.
 *     sum                                 int                            - to store the sum of the digits
 *     pr                                  int                            - to store the product of its digits
 *    d, f                                 int                            - to store the extracted digits
 *    sum2                                 int                            - to store the sum of the sum and product of its digits
 */