/** 3. Write a program to print the following pattern based upon the user’s choice.
SAMPLE INPUT AND OUTPUT
Enter your choice 1 for STRING TRIANGLE or 2 for NUMBER TRIANGLE : 1
Enter a String : Java
J A V A
A V A J
V A J A
A J A V
Enter your choice 1 for STRING TRIANGLE or 2 for NUMBER TRIANGLE : 2
Enter how many rows : 6
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
2 4 6 8 10
*/

import java.util.*;
public class switch_case_3
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    System.out.print("Enter your choice 1 for STRING TRIANGLE or 2 for NUMBER TRIANGLE : ");
    int ch=in.nextInt();
    System.out.println();
    int count=0;
    String s="";
    switch (ch)
    {
      case 1:
      
       System.out.println("Enter a String: ");
       s=in.next();
       s=s.toUpperCase();
       int len=s.length();
       for(int i=0;i<len;i++)
       {
         count=0;
         for(int j=i;j<len;j++)
          {
           System.out.print(s.charAt(j)+" ");
           count++;
          }
          int n=0;
         for(int k=1;k<=len-count;k++)
          {
           System.out.print(s.charAt(n)+" ");
           n++;
         }
         System.out.println();
       }
      break;
      case 2:
      System.out.print("Enter the number of rows: ");
      int r=in.nextInt();
      System.out.println();
      int p=0;
      for(int i=1;i<=r;i++)
      {
        if(i%2==0)
         p=2;
        else
         p=1;
        for(int j=1;j<=i;j++)
        {
          System.out.print(p+" ");
          p=p+2;
        }
        System.out.println();
      }
      break;
     
     default:
     System.out.println("Wrong choice!!!");
    }
    }
  }
  
  /**
   Description Table:
    
      VARIABLE                      DATA TYPE                           DESCRIPTION
         ch                           int                               - to store the user's choice.
        count                         int                               - to count no. of iterations of first inner loop.
         s                           String                             - to store the entered string.
        len                           int                               - to store length of entered string.
       i, j, k                        int                               - control variables.
         r                            int                               - to store no. of rows.
         p                            int                               - to store the odd and even numbers.
   */
