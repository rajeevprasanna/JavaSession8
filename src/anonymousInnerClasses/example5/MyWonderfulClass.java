package anonymousInnerClasses.example5;

//https://gist.github.com/rajeevprasanna/10520664
public class MyWonderfulClass {
	void go() {
		Bar b = new Bar();
		b.doStuff(new Foo() {
			public void foof() {
				System.out.println("foofy");
			} // end foof method
		}); // end inner class def, arg, and b.doStuff stmt.
	} // end go()
} // end class