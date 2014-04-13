package anonymousInnerClasses.example4;

//https://gist.github.com/rajeevprasanna/10520664
public class Implementation2 {
	Apple apple = new Apple() {
		@Override
		public void print() {
			System.out.println("Printed from subclass of Apple !");
		}

		/*
		 * Not a Overriden method.
		 */
		public void add() {
			System.out.println("I am not present in Apple !");
		}
	};

	public void r() {
		/*
		 * This will work fine.
		 */
		apple.print();

		 //apple.add();
		/*
		 * apple.add();
		 * 
		 * This will give a compilation error because, from a superclass
		 * reference variable we can not call a member of subclass that is not
		 * present in superclass.
		 */

	}
}
