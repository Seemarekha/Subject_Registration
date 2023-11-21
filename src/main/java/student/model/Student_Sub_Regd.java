package student.model;

public class Student_Sub_Regd {
	public String Course_code;
	public String Course_Name;
	public String Credit;
	
	
	public String getCourse_code() {
		return Course_code;
	}
	public void setCourse_code(String course_code) {
		Course_code = course_code;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	@Override
	public String toString() {
		return "Student_Sub_Regd [Course_code=" + Course_code + ", Course_Name=" + Course_Name + ", Credit=" + Credit
				+ "]";
	}
	
	
}
