/**
 * 1. Write a program to computerize the billing operation of a telephone company .The bill has to be generated
      based on the following conditions:
      Number of calls Amount per call
      First 50 calls - free
      Next 100 calls - 80paise per call
      Next 200 calls - Rs. 1 per call
      Rest of the calls - Rs 1.50 per call
      A rent of Rs 150 is charged from every customer. A tax of 15% is charged on the sum of charges and rent. The
      total amount is tax added to the sum of charges and rent .Print the bill for a customer.**/

import java.util.*;
public class if_else_1
{
    public static void main(String args[])
    {
     Scanner in =new Scanner(System.in);
     System.out.println("Enter the no. of calls: ");
     int n=in.nextInt();
     double amount=0,rent=150,sum=0,tax=0,totamt=0;
      if(n<=50)
       amount=0;
      else if(n>50&&n<=150)
       amount=0.8*(n-50);
      else if(n>150&&n<=350)
       amount=50*0+100*0.8+(n-150)*1;
      else if(n>350)
       amount=100*0.8+200*1+(n-350)*1.50;
      else
       System.out.println("Wrong input!!!");
      sum=amount+rent;
      tax=15.0/100.0*sum;
      totamt=tax+sum;
      System.out.println("\t BILL");
      System.out.println("Rent: Rs."+rent);
      System.out.println("Tax: Rs."+tax);
      System.out.println("Charges for calls: Rs."+amount);
      System.out.println("Total amount: Rs."+totamt);
    }
}

/** Description Table:
 
 *          VARIABLE                            DATA TYPE                                 DESCIPTION
           
 *             n                                  int                            -  to store the number of calls.
 *          amount                               double                          -  to store the charge for the calls.
 *           rent                                double                          -  to store the rent.
 *           sum                                 double                          -  to store the sum of rent and charge of calls.
 *           tax                                 double                          -  to store the tax.
 *          totamt                               double                          -  to store the total amount after adding the tax
                                                                                    and the sum.
 */