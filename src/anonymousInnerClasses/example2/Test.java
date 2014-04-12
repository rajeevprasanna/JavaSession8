package anonymousInnerClasses.example2;

//https://gist.github.com/rajeevprasanna/10520664
public class Test {
	public static void main(String[] args) {
		Animal h = new Horse();
		h.eat(); // Legal, class Animal has an eat() method
//		h.buck(); // Not legal! Class Animal doesn't have buck()
	}
}
