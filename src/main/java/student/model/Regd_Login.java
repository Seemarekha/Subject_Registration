package student.model;

public class Regd_Login {
	private String std_name;
	private String regd_no;
	private String email; 
	private String password;
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getRegd_no() {
		return regd_no;
	}
	public void setRegd_no(String regd_no) {
		this.regd_no = regd_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAcademic_year() {
		return academic_year;
	}
	public void setAcademic_year(String academic_year) {
		this.academic_year = academic_year;
	}
	private String confirmpassword;
	private String contact_no;
	private String semester;
	private String academic_year;
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "Regd_Login [std_name=" + std_name + ", regd_no=" + regd_no + ", email=" + email + ", password="
				+ password + ", confirmpassword=" + confirmpassword + ", contact_no=" + contact_no + ", semester="
				+ semester + ", academic_year=" + academic_year + "]";
	}
	public Regd_Login(String std_name, String regd_no, String semester, String academic_year) {
		super();
		this.std_name = std_name;
		this.regd_no = regd_no;
		this.semester = semester;
		this.academic_year = academic_year;
	}
	public Regd_Login() {
		super();
	}

	
}
