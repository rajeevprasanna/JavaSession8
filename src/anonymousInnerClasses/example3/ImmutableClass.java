package anonymousInnerClasses.example3;

import java.util.Date;

public final class ImmutableClass {

	private String userName;
	private String password;
	private Date creationDate;

	public ImmutableClass(String userName, String password, Date date) {
		this.userName = userName;
		this.password = password;
		Date newDate = new Date(date.getTime());
		this.creationDate = newDate;
//		this.creationDate = date;
	}

	public String getUserName() {
		return this.userName;
	}
	
	public void startTransaction(){
		System.out.println(creationDate);
		String userName = getUserName();
		//insert userName into database
	}

	public String getPassword() {
		return this.password;
	}

//	public Date getCreationDate() {
//		return creationDate;
//	}
	
	public long getTimeInMilliSec(){
		return creationDate.getTime();
	}
}
