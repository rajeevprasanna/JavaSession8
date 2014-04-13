package regularInnerClasses.example3;

//https://gist.github.com/rajeevprasanna/10519350
public class MyOuter {
	
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		System.out.println(this);//this refers to MyOuter
		in.seeOuter();
	}

	class MyInner {
		public void seeOuter() {
			System.out.println(this);//this refers to MyInner
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + MyOuter.this);
			System.out.println("Outer class ref is " + MyOuter.this.x);//not good way as it is directly accessible
			//access a method which takes outer class reference as a parameter
			
			MyOuter2 myOuter2 = new MyOuter2();
			myOuter2.testReference(MyOuter.this);
			//myOuter2.testReference(this); // check the compilation error message.
		}
		
		public void extraMethod(){
			System.out.println("this is extra method");
		}
	}

	public static void main(String[] args) {
		MyOuter.MyInner inner = new MyOuter().new MyInner();		 
		inner.seeOuter();
		inner.extraMethod();
	}
}
