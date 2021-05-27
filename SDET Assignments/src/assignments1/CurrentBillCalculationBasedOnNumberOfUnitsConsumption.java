package assignments1;

import java.util.Scanner;

public class CurrentBillCalculationBasedOnNumberOfUnitsConsumption {

       public String CustomerType;
       public int UnitsCount;
       public long BillValue;
       Scanner scn = new Scanner(System.in);
       public String getCustomerType() {
           System.out.println("Enter the CustomerType : ");
              CustomerType = scn.next();
              return CustomerType;
       }
       
       public int getUnitsCount() {
           System.out.println("Enter the Units charged : ");
           UnitsCount = scn.nextInt();
              return UnitsCount;
       }
       
       public void calculateBillValue(String CustomerType, int UnitsCount) {
              if(CustomerType.equals("domestic")) 
              {
                     if(UnitsCount <= 100) {
                           BillValue = UnitsCount * 3;
                           
                           System.out.println("Customer Type :" + CustomerType + "\n" + "Units Chaged :" + UnitsCount + "\n" + "Bill Value : " + BillValue  );
                     }
                     else if(UnitsCount > 100 & UnitsCount < 200) {
                           BillValue = UnitsCount * 4;
                           System.out.println("Customer Type :" + CustomerType + "\n" + "Units Chaged :" + UnitsCount + "\n" + "Bill Value : " + BillValue  );
                     }
                     else  {
                           System.out.println("Invalid units count provided."  );
                     }
              }
              else if(CustomerType.equals( "commercial")) {
                     if(UnitsCount <= 100) {
                           BillValue = UnitsCount * 10;
                           System.out.println("Customer Type :" + CustomerType + "\n" + "Units Chaged :" + UnitsCount + "\n" + "Bill Value : " + BillValue  );
                     }
                     else if(UnitsCount > 100 & UnitsCount < 200) {
                           BillValue = UnitsCount * 20;
                           System.out.println("Customer Type :" + CustomerType + "\n" + "Units Chaged :" + UnitsCount + "\n" + "Bill Value : " + BillValue  );
                     }
                     else  {
                           System.out.println("Invalid units count provided."  );
                     }
              }
                     
                     }
       
}
