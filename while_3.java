/**
 3. Write a program to print a Factorial table.
 */

import java.util.*;
public class while_3
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int limit=in.nextInt();
    System.out.println();
    int i=1,f=1;
    String output="";
    System.out.println("Factorial Table: "); 
    while(i<=limit)
    { 
      System.out.print(i+"! = 1");
      int j=2;
      f=1;
      while(j<=i)
      {
        f=f*j;
        output=output+"x"+j;
        j++;
      }
      System.out.println(output+" = "+f);
      i++;
      output="";
    }
  }
}

/** Description Table: 
 
 *     VARIABLE                             DATA TYPE                          DESCRIPTION
 *      limit                                 int                           - to store the limit.
 *        i                                   int                           - to use as control variable
 *        f                                   int                           - to store the factorial
 *     output                                String                         - to store the series of values of the tables.
 *        j                                   int                           - to use as control variable for the inner loop
 */