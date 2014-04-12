package methodLocalInnerClasses.example1;

//https://gist.github.com/rajeevprasanna/10519905
public class MyOuter2 {

	private String x = "Outer2";

	void doStuff() {

		// Just because you declared the class doesn't mean you created an
		// instance of it. So to use the inner class you must make an instance
		// of it somewhere within the method but below the inner class
		// definition
		class MyInner {

			public void seeOuter() {

				System.out.println("Outer x is " + x);

			} // close inner class method

		} // close inner class definition

	} // close outer class method doStuff()

} // close outer class
