package student.model;

public class stdnt_subj_redgn {

	
private String fullname;
private String regno;
private String semester;
private String academicyear;


public String getFullname() {
	return fullname;
}


public void setFullname(String fullname) {
	this.fullname = fullname;
}


public String getRegno() {
	return regno;
}


public void setRegno(String regno) {
	this.regno = regno;
}


public String getSemester() {
	return semester;
}


public void setSemester(String semester) {
	this.semester = semester;
}


public String getAcademicyear() {
	return academicyear;
}


public void setAcademicyear(String academicyear) {
	this.academicyear = academicyear;
}


@Override
public String toString() {
	return "stdnt_subj_redgn [fullname=" + fullname + ", regno=" + regno + ", semester=" + semester + ", academicyear="
			+ academicyear + "]";
}


}
