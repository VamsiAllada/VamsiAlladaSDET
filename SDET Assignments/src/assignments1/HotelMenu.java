package assignments1;

import java.util.Scanner;

public class HotelMenu {
	Scanner sc=new Scanner(System.in);
	int i,n,count;
	System.out.println("Enter Item number (1.Dosa, 2.Idly, 3.Pongal): ");
	i=sc.nextInt();
	System.out.println("Number of plates: ");
	n=sc.nextInt();
	if(i==1)
		count=20*n;
	else if(i==2)
		count=10*n;
	else
		count=30*n;
	System.out.println("Final bill: "+count);
}
