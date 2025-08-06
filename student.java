package studentCourseRegistration;

public class student {
	String Id;
	String Name;
	String Email;
	
	public student(String Id,String Name,String Email) {
		this.Id=Id;
		this.Name=Name;
		this.Email=Email;
	}
	
	public String getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
}