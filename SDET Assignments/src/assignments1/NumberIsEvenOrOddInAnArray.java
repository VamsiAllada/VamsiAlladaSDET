package assignments1;

public class NumberIsEvenOrOddInAnArray {
		public static void main(String [] args)
		{  
		int a[]={1,3,5,6,8,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		} 
	
}
