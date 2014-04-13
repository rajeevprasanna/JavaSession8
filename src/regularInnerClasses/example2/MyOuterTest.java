package regularInnerClasses.example2;


public class MyOuterTest {
	public static void main(String[] args) {
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner();

		MyOuter.MyInner inner2 = new MyOuter().new MyInner();
		//System.out.println(.y);
		// oneliner : MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}
}
