/**
 6. Write a program to print any multiplication table. The user can see any numbers table if he/she wants to stop the
program they must enter zero.
 */
import java.util.*;
public class do_while_6
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=0;
    int pr=0;
    do
    {
     System.out.println("Enter 0 to terminate the program");
     System.out.print("Enter which numbers table you want to see: ");
     n=in.nextInt();
     if(n==0)
     break;
     System.out.println();
     System.out.print("Enter "+n+"'s tables from which limit: ");
     int fl=in.nextInt();
     System.out.println();
     System.out.print("Enter "+n+"'s tables till which limit: ");
     int ll=in.nextInt();
     System.out.println(); 
     do
     {
       pr=n*fl;
       System.out.println(n+" x "+fl+" = "+pr);
       fl++;
     }
     while(fl<=ll);
    }
    while(n!=0);
    System.out.println("Program terminates.");
   }
}

/**Description Table:

 *   VARIABLE                     DATA TABLE                       DESCRIPTION
 *      n                        integer (int)               - to store the inputted number.
 *      pr                       integer (int)               - to store the product of the number in the table.
 *      fl                       integer (int)               - to store the lower limit of the table.
 *      ll                       integer (int)               - to store the last limit of the table.
 **/
 
