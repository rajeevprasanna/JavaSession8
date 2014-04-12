package anonymousInnerClasses.example4;

//https://gist.github.com/rajeevprasanna/10520664
public class Implementation {
	/*
	 * This looks like we are creating an object of Apple class, but actually we
	 * we have created an instance of anonymous subclass of Apple. The statement
	 * written below creates an anonymous inner class with an instance of it and
	 * the class is a subclass to Apple.
	 */
	//Creating a anonymous inner class using a class reference variable.
	Apple apple = new Apple() {
		@Override
		public void print() {
			System.out.println("Printed from subclass of Apple !");
		}
	};
}
