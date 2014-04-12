package methodLocalInnerClasses.example3;

//https://gist.github.com/rajeevprasanna/10519905
public class MyOuter4 {
	
	private String x = "Outer2";

	void doStuff() {

		//String z = "local variable";
		
		final String z = "local variable";
		
		class MyInner {
			
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				//z is local variable of method
				//Marking the local variable z as final fixes the problem
				System.out.println("Localvariablezis" + z); // Won'tCompile!
			} // close inner class method
			
		}// close inner class definition
		
	} // close outer class method doStuff()
	
} // close outer class