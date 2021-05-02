package assignments1;

public class MultiplicationOfAllNumbersInArray {
		   public static void main(String [] args){
		      int[] array = {1, 2, 3, 4, 5, 9};
		      int m = 1;
		      for( int num : array) {
		          m = m*num;
		      }
		      System.out.println("Multiplication of array elements is:"+m);
		   }
		}
	
