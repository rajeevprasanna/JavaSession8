package methodLocalInnerClasses.example1;

public class MyOuterX {
	private String x = "Outer2";

	void doStuff() {
		class MyInner2 implements InnerInterface {
			public void testReference() {
				System.out.println("Outer x is " + x);
				System.out.println(MyOuterX.this);
			}
		}
		MyInner2 myInner2 = new MyInner2();

		InnerClassReferenceTest innerClassReferenceTest = new InnerClassReferenceTest();
		innerClassReferenceTest.testReference(myInner2);
	}
}
