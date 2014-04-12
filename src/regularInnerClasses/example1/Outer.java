package regularInnerClasses.example1;

//https://gist.github.com/rajeevprasanna/10519350
public class Outer {
	
	//inner class definition
	class MyInner {
//		//Piece of cake. And if you compile it,
//		  %javac MyOuter.java
//		  you'll end up with two class files: MyOuter.class
//		  MyOuter$MyInner.class

		
//		The inner class is still, in the end, a separate class, so a separate class file is generated for it. But the inner class file isn't accessible to you in the usual way. You can't say
//		  %java MyOuter$MyInner
		
		 public void seeOuter() {
			 //inner class is able to access outer class member variables.
	           System.out.println("Outer x is " + x);
	        }
	}//close inner class definition
	
	
	private int x = 7;
	
	
}// close outer class
