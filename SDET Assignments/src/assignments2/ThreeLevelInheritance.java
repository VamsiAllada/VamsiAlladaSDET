package assignments2;

public class ThreeLevelInheritance {

	interface Impl{
		public void method1();
	}

	abstract class ABCLS implements Impl{
		public abstract void method2();
	}


	public class ThreeLevelInheritance extends ABCLS{
		public static void main(String[] args) {
			Program1 obj = new Program1();
			obj.method1();
			obj.method2();
		}

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			System.out.println("m1() is called");
		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			System.out.println("m2() is called");		
		}
	}
	
}
