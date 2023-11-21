package student.model;

public class sem_3St {

private String CourseCode;
private String CourseName;
private String Credits;
private String CourseType;
private String AcademicYear;
public String getCourseCode() {
	return CourseCode;
}
public void setCourseCode(String courseCode) {
	CourseCode = courseCode;
}
public String getCourseName() {
	return CourseName;
}
public void setCourseName(String courseName) {
	CourseName = courseName;
}
public String getCredits() {
	return Credits;
}
public void setCredits(String credits) {
	Credits = credits;
}
public String getCourseType() {
	return CourseType;
}
public void setCourseType(String courseType) {
	CourseType = courseType;
}
public String getAcademicYear() {
	return AcademicYear;
}
public void setAcademicYear(String academicYear) {
	AcademicYear = academicYear;
}
@Override
public String toString() {
	return "registered_std [CourseCode=" + CourseCode + ", CourseName=" + CourseName + ", Credits=" + Credits
			+ ", CourseType=" + CourseType + ", AcademicYear=" + AcademicYear + "]";
}


}






