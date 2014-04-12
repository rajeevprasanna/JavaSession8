package anonymousInnerClasses.example3;

//https://gist.github.com/rajeevprasanna/10520664
public class Food2 {
	Cookable c = new Cookable() {//Refer to an object from a class that implements the Cookable interface. 
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};
}
