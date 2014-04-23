package anonymousInnerClasses.example3;

import java.util.Date;

public class ImmutablityTest {
	  
	public static void main(String[] args){
		
//		ImmutableSubClass im1 = new ImmutableSubClass("u2", "p2");
		
		Date creationDate1 = new Date();
		ImmutableClass im = new ImmutableClass("u2", "p2", creationDate1);
		System.out.println("Before => "+ im.getTimeInMilliSec());
		creationDate1.setDate(2342342);
		System.out.println("After  => "+ im.getTimeInMilliSec());
		im.startTransaction();
//		System.out.println("Before modification => "+ im.getCreationDate());
		
		ImmutablityTest it = new ImmutablityTest();
		it.mutablityTest(im);
//		System.out.println(im.getCreationDate());
//		System.out.println("After modification => "+ im.getCreationDate());
		
		
		//		it.test(im1);
		
//		im1.startTransaction();				
	}
	
	public void mutablityTest(ImmutableClass im){
//		Date d = im.getCreationDate();
//		d.setTime(156735476);
	}
	
//	public void test(ImmutableSubClass im){
//		im.setUserName("modify userName");
//		System.out.println(im.getUserName());		
//	}  
}	
