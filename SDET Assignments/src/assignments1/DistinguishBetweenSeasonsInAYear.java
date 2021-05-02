package assignments1;
import java.util.Scanner;
public class DistinguishBetweenSeasonsInAYear {
	    public static void main(String [] args) {
	      int x;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the month");
	      x=sc.nextInt();
	      if(x==1 || x==2 || x==3 ||x==4)
	      {
	       System.out.println("Summer");
	      }
	      else if(x==5 || x==6 || x==7 ||x==8)
	      {
	       System.out.println("Winter");
	      }
	     else if(x==9 || x==10 || x==11 ||x==12)
	      {
	       System.out.println("Rainy");
	      }
	      else
	      {
	        System.out.println("Invalid");  
	      }
	      
	      
	    }
	} 
	
