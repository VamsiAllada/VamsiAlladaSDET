package assignments1;
public class CountOfDuplicateNumbersInAnArray { 
		public static void main(String[] args) {    
		        int [] arr = new int [] {4, 2, 3, 4, 2, 7, 8, 8, 7};  
		        int count = 0;
		        System.out.println("Duplicate elements in given array: ");    
		        for(int i = 0; i < arr.length; i++) {  
		            for(int j = i + 1; j < arr.length; j++) {  
		                if(arr[i] == arr[j])  
		                    count++;  
		            }  
		          System.out.println(count);
		        }  
		    }  
		} 
