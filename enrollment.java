package studentCourseRegistration;

public class enrollment {
	String Student_Id;
	String Course_Id;
	String Date_Of_Enrollment;

	public enrollment(String Student_Id,String Course_Id,String Date_Of_Enrollment) {
		this.Course_Id=Course_Id;
		this.Date_Of_Enrollment=Date_Of_Enrollment;
		this.Student_Id=Student_Id;
	}
	public String getStudent_Id() {
		return Student_Id;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public String getDate_Of_Enrollment() {
		return Date_Of_Enrollment;
	}
}
