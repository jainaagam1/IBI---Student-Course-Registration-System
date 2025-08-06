package studentCourseRegistration;

public class course {
	String course_Id;
	String course_Name;
	String Instructor;
	
	public course(String course_Id,String course_Name,String Instructor) {
		this.course_Id=course_Id;
		this.course_Name=course_Name;
		this.Instructor=Instructor;
	}
	
	public String getcourse_Id(){
		return course_Id;
	}
	public String getcourse_Name() {
		return course_Name;
	}
	public String getInstructor() {
		return Instructor;
	}
	
}
