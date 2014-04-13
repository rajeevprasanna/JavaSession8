package regularInnerClasses.example1;

public class Outer2 {

	private int x = 7;
	
	class MyInner implements MyInnerInterface {
		public void insertXIntoDB() {
			System.out.println("Outer x is " + x);
			//DB insert x
		}
	} 	
}
