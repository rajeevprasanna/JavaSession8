package methodLocalInnerClasses.example2;

//https://gist.github.com/rajeevprasanna/10519905
public class MyOuter3 {
	
	private String x = "Outer2";

	void doStuff() {
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
			} // close inner class method
		} // close inner class definition
		
		MyInner mi = new MyInner(); // This line must come
		MyInner mi2 = new MyInner();							// after the class
		
		mi.seeOuter();
	
	} // close outer class method doStuff()

} // close outer class
