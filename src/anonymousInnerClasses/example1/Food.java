package anonymousInnerClasses.example1;

//https://gist.github.com/rajeevprasanna/10520664
public class Food {
	Popcorn p = new Popcorn() {
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
}
