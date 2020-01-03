/** 4. Write a program to check whether a number is a prime palindrome or not.
 */

import java.util.*;
public class while_4 
{
  public static void main(String args[])
 {
   Scanner in=new Scanner (System.in);
   System.out.println("Enter a number to check whether it is a prime palindrome or not: ");
   int n=in.nextInt();
   int temp=n,d=0,r=0,flag=0,i=2;
   while(i<n)
   {
     if(n%i==0)
     flag++;
     i++;
    }
   while(temp!=0)
   {
     d=temp%10;
     r=r*10+d;
     temp/=10;
    }
   if(r==n && flag==0)
   System.out.println("It is a prime palindrome number.");
   else
   System.out.println("It is not a prime palindrome number.");
 }
}

/** Description Table: 
 
 *   VARIABLE                           DATA TYPE                           DESCRIPTION
 *      n                                 int                           - to store the inputted number.
 *    temp                                int                           - to store the number in another variable
 *      d                                 int                           - to store the extracted digit.
 *      r                                 int                           - to store the reversed number.
 *    flag                                int                           - to count the number of factors
 *      i                                 int                           - to use as control variable and find the factors
 */