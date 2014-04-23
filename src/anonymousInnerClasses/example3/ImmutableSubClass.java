package anonymousInnerClasses.example3;

//public class ImmutableSubClass extends ImmutableClass{
public class ImmutableSubClass {
	
//	public ImmutableSubClass(String userName, String password) {
//		super(userName, password);		 
//	}		

	private String userName;
	private String password;
	public void setUserName(String userName) {
		this.userName = userName;
	}
  
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public void startTransaction(){
//		String userName = getUserName();
//		//insert userName into database
//	}
	 
}
