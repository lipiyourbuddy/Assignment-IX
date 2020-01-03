/**
A library charges a fine for books returned late as given below:
No.of days Paise per day
First 5  - 40Ps.
6 to 10  - 65 Ps.
Above 10 - 80 Ps.
Write a program to calculate the fine assuming that a book is returned N days late.
*/

import java.util.*;
public class if_else_5
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the no. of days that charges have to calculated for: ");
    int days=in.nextInt();
    System.out.println(" ");
    double charge=0;
    if (days<=5)
    
        charge=days*0.4;
    else if(days>5&&days<=10)
    
        charge=5*0.4+(days-5)*0.65;
    else if (days>10)
    
        charge=5*0.4+5*0.65+(days-10)*0.8;
    else
        System.out.println("Wrong input!");
    System.out.print("Your charges are: Rs."+charge);
  }
}

/** Description Table:
 
 *     VARIABLE                            DATA TYPE                           DESCRIPTION
 
 *      days                             integer (int)                    - to store the inputted number of days exceeding the 
 *                                                                          due date.
 *     charge                               double                        - to store the charges for late submission.
 */