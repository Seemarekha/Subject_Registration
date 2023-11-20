package Admin.model;

public class StdModel {
	
	private String std_name;
	private String std_regd;
	private String semester;
	private String academic_year;
	
	
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_regd() {
		return std_regd;
	}
	public void setStd_regd(String std_regd) {
		this.std_regd = std_regd;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getAcademic_year() {
		return academic_year;
	}
	public void setAcademic_year(String academic_year) {
		this.academic_year = academic_year;
	}
	
	
	@Override
	public String toString() {
		return "StdModel [std_name=" + std_name + ", std_regd=" + std_regd + ", semester=" + semester
				+ ", academic_year=" + academic_year + "]";
	}
	

}
