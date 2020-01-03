/**
2. Write a Program in Java to print all DISARIUM numbers between two limits.
Note: A number will be called DISARIUM, if sum of its digits powered with their respective position is equal to the
original number.
For example 135 is a DISARIUM NUMBER.
 */

import java.util.*;
public class for_loop_2
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the lower limit: ");
    int ll=in.nextInt();
    System.out.println("Enter the upper limit: ");
    int ul=in.nextInt();
    int d=0,count,sum,l=0;
    System.out.print("The disarium numbers within this limit are: ");
    for(int i=ll;i<=ul;i++)
    { 
      count=0;
      sum=0;
      for(int temp=i;temp!=0;temp=temp/10)
      {
        d=temp%10;
        count++;
      }
      for(int temp2=i;temp2>0;temp2=temp2/10)
      {
       l=temp2%10;
       sum=sum+(int)Math.pow(l,count);
       count--;
      }
      if(sum==i)
      System.out.print(i+", ");
    }
  }
}

/** Description Table:
    
 *        VARIABLE                         DATA TYPE                            DESCRIPTION
 
 *          ll                            integer (int)                     - to store the entered lower limit.
 *          ul                            integer (int)                     - to store the inputted upper limit.
 *          d                             integer (int)                     - to store the extracted digit.
 *        count                           integer (int)                     - to store the number of digits of the number. 
 *         sum                            integer (int)                     - to store the sum of digits powered with their positions.
 *          l                             integer (int)                     - to store the extracted digit in the second loop.
 *          i                             integer (int)                     - to use as a control variable.
 *        temp                            integer (int)                     - to store the value of i in inner loop
 *        temp2                           integer (int)                     - to store the value of i in the inner second loop.
 */