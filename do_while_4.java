/**
 4. The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on
every book. The ISBN is based upon a 10 digit code. The ISBN is legal if:
1 x digit1 + 2 x digit2 + 3 x digit3 + 4 x digit4 + 5 x digit5+ 6 x digit6 +7 x digit7 + 8 x digit8 + 9 x digit9 +10 x
digit10 is divisible by 11.
EXAMPLE : For an ISBN 1401601499
Sum= 1x1 + 4x2 +0x3 +1x4 +6x5 + 0x6 + 1x7 + 4x8 + 9x9 + 9x10 =253 which is divisible by 11.

Write a program to:
(i) Input the ISBN code as a 10-digit integer.
(ii)If the ISBN is not a 10-digit integer, output the message, "Illegal ISBN" and terminate the program.
(iii)If the number is 10-digit, extract the digits of the number and compute the sum as explained above. If the sum
is divisible by 11, output the message, "Legal ISBN". If the sum is not divisible by 11, output the message, "Illegal
ISBN".
*/

import java.util.*;
public class do_while_4
{
 public static void main(String args[])
 {
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the ISBN code as a 10-digit integer: ");
   int n=in.nextInt();
   int temp=n, count=0,sum=0,d=0;
   do 
   {
     count++;
     temp=temp/10;
   }
   while(temp!=0);
   int count2=count;
   if(count==10)
   {
     do
     {
      d=n%10;
      sum=sum+d*count2;
      n=n/10;
      count2--;
     }
     while(n!=0);
   }
   else
   {
    System.out.println("Illegal ISBN");
    System.out.println("Program terminates.");
    System.exit(0);
   }
    if(sum%11==0)
    System.out.println("Legal ISBN");
    else
    System.out.println("Illegal ISBN");
   } 
}

/** Description Table:
 
 *  VARIABLE                        DATA TYPE                         DESCRIPTION
 
 *     n                           integer(int)                   - to store the inputted ISBN code.
 *    temp                         integer(int)                   - to store the code in another variable.
 *    count                        integer(int)                   - to store the number of digits of the code.
 *    sum                          integer(int)                   - to store the sum .
 *     d                           integer(int)                   - to store the extracted digit.
 *   count2                        integer(int)                   - to store the number of digits in
                                                                    another variable.                                                                
 */ 