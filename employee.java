/**
 Write a class with name employee, to find the gross pay of an employee for the following allowances and
 deduction. Use meaningful variables.
  
   Dearness Allowance = 25% of the Basic Pay
   House Rent Allowance = 15% of Basic Pay
   Provident Fund = 8.33% of Basic Pay
   Net Pay = Basic Pay + Dearness Allowance + House Rent Allowance - Provident Fund
   Gross Pay = Net Pay - Tax
  
   If the Net Pay is above Rs. 3,00,000/- per annum then income tax at the rate of 5% of the annual salary exceeding
   Rs. 3,00,000/- is deducted on monthly basis at source. Taking name of the employee and the basic(monthly) pay
   as inputs a pay slip for an employee is to be printed. The format of the pay slip is as follows:
   
   
   PAY SLIP
   NAME : xxxxxx
   BASIC PAY =Rs. xxxxxx
   DEARNESS ALLOWANCE = Rs. xxxxxx
   HOUSE RENT ALLOWANCE = Rs. xxxxxx
   PROVIDENT FUND = Rs. xxxxxx
   MONTHLY TAX = Rs. xxxxxx
   GROSS PAY = Rs. xxxxxx.
 */

import java.io.*;
public class employee
{
  public static void main(String args[]) throws IOException
  {
      InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in=new BufferedReader(read);
      System.out.println("Enter the name: ");
      String name=in.readLine();
      System.out.println("Enter the Basic/Monthly Pay: ");
      double bp=Integer.parseInt(in.readLine());
      double da=0,hra=0,pf=0,np=0,gp=0,atax=0,mtax=0;
      da=25.0/100.0*bp;
      hra=15.0/100.0*bp;
      pf=8.33/100.0*bp;
      np=bp+da+hra-pf;
      if ((np*12)>300000)
      atax=5.0/100.0*(np*12-300000);
      mtax=atax/12.0;
      gp=np-mtax;
      System.out.println("\tPAY SLIP");
      System.out.println("NAME: "+name);
      System.out.println("BASIC PAY: Rs."+bp);
      System.out.println("DEARNESS ALLOWANCE: Rs."+da);
      System.out.println("HOUSE RENT ALLOWANCE: Rs."+hra);
      System.out.println("PROVIDENT FUND: Rs."+pf);
      System.out.println("MONTHLY TAX: Rs."+mtax);
      System.out.println("GROSS PAY: Rs."+gp);
    }
} 

/** Description Table:
 
 *     VARIABLE                            DATA TYPE                          DESCRIPTION
 
 *      name                               String                      - to store the name inputted.
 *      bp                                 double                      - to store the inputted Basic or Monthly Pay.
 *      da                                 double                      - to store the Dearness Allowance.
 *      hra                                double                      - to store House Rent Allowance.
 *      pf                                 double                      - to store the Provident Fund.
 *      np                                 double                      - to store the Net Pay.
 *      gp                                 double                      - to store the Gross Pay.
 *      atax                               double                      - to store the annual tax for annual net pay exceeding
                                                                         Rs. 3,00,000.
 *      mtax                               double                      - to store the monthly tax.                                                                        
 */