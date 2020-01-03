/**
 6. To foster a sense of water conservation, the water department has an annual water conservation tax policy. The
    rates are based on the water consumption of the consumer. The tax rates are as follows:
    Water consumed (in Gallons) Tax Rate in Rs.
    Upto 45                           No Tax
    More than 45 but 75 or less    -  475.00
    More than 75 but 125 or less   -  750.00
    More than 125 but 200 or less  - 1225.00
    More than 200 but 350 or less  - 1650.00
    More than 350                  - 2000.00
 */
import java.util.*;
public class if_else_6
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   System.out.print("Enter the amount of the water consumption in gallons: ");
   float w=in.nextFloat();
   System.out.println();
   float tax=0;
   if (w<=45)
    tax=0;
   else if(w>45&&w<=75)
    tax=475;
   else if(w>75&&w<=125)
    tax=750;
   else if(w>125&&w<=200)
    tax=1225;
   else if(w>200&&w<=350)
    tax=1650;
   else if(w>350)
    tax=2000;
   else 
   System.out.println("Wrong input!!!");
   System.out.print("Tax for "+w+" gallons of water is: Rs."+tax);
  }
}


/** Description Table:
 
 *     VARIABLE                             DATA TYPE                            DESCRIPTION
 
 *        w                                   float                         - to store the inputted amount of water in gallons.
 *       tax                                  float                         - to store the tax.
 */