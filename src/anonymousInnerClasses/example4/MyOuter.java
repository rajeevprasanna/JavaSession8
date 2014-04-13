package anonymousInnerClasses.example4;


//https://gist.github.com/rajeevprasanna/10519350
public class MyOuter {
	 
	public static void main(String[] args) {
		MyOuter2 myOuter2 = new MyOuter2();
		
		
		TestClass testClass1 = new TestClass();
		myOuter2.testReference(testClass1);
		
		
		//override default behavior
		//1. regular inner class
		RegularInnerClass regularInnerClass = new MyOuter().new RegularInnerClass();
		myOuter2.testReference(regularInnerClass);
		
		
		//2. Method Local inner class
		class MethodLocalInnerClass extends TestClass{
			@Override
			public void defaultMethod(){
				System.out.println("method local inner class => default method");
			}
		}
		MethodLocalInnerClass methodLocalInnerClass = new MethodLocalInnerClass();
		myOuter2.testReference(methodLocalInnerClass);
		
		
		
		//3. Anonymous inner class
		TestClass anonymous1 = new TestClass(){
			@Override
			public void defaultMethod(){
				System.out.println("anonymous local1 inner class => default method");
			}
		};
		myOuter2.testReference(anonymous1);
		
		
		//4. inline implmentation of anonymous class		 
		myOuter2.testReference(new TestClass(){
			@Override
			public void defaultMethod(){
				System.out.println("anonymous local2 inner class => default method");
			}
		});
	}
	
	private class RegularInnerClass extends TestClass{
		@Override
		public void defaultMethod(){
			System.out.println("regular inner class => default method");
		}
	}
}
