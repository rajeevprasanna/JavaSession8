package anonymousInnerClasses.example1;

//https://gist.github.com/rajeevprasanna/10520664
public class Food {
	
	//Local inner class
	class Popcorn2 extends Popcorn{
		@Override
		public void pop() {
			System.out.println("regular inner class popcorn");
		}
	}
	Popcorn p1 = new Popcorn2();
	Popcorn p12 = new Popcorn2();
	
	
	//Anonymous inner class
	Popcorn p = new Popcorn() {
		@Override
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
	
	public void testPop(){
		p.pop();
	}
	//Popcorn p10 = new can't do it
}
