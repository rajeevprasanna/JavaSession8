package staticNestedClasses.example1;

//https://gist.github.com/rajeevprasanna/10520895
public class Broom {	
	private int x = 10;
	public static class B2 {
		void goB2() {
			System.out.println("hi 2");
//			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest(); // both class names
		n.go();
		B2 b2 = new B2();
		b2.goB2();
	}
}
