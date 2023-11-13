<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/STUDENT/Std_Reg_css/reg.css">
</head>
<body>
<form action="<%=request.getContextPath() %>/std_registration" method="post">

<input type="hidden" id="status" value="<%= request.getAttribute("status")%>">

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
					
						<form action="std_login" method="post" class="register-form" id="register-form">
							
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="Name" id="name" placeholder="User Name" required="required"/>
							</div>
							<div class="form-group">
								<label for="registration_no.">
									<i class="zmdi zmdi-file-text"></i>	</label>
								<input type="number" name="Registration" id="registration" placeholder="Your registration no." required="required"/>
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label>
								 <input type="email" name="Email" id="email" placeholder="Your Email" required="required"/>
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="Password" id="pass" placeholder="Password" required="required"/>
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock"></i></label>
								<input type="password" name="ConfirmPassword" id="con_pass"
									placeholder="Confirm password" required="required"/>
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-phone"></i></label>
								<input type="text" name="Contact" id="contact"
									placeholder="Contact no" required="required"/>
							</div>
							
							<div class="form-group">
								<label for="AcademicYear"><i class="zmdi zmdi-graduation-cap"></i></label>
								<input type="text" name="AcademicYear" id="AcademicYear"
									placeholder="Academic Year" required="required"/>
							</div>

							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sing up image">
						</figure>
						<a href="std_login.jsp" class="signup-image-link">I am already member</a>
					</div>
				</div>
			</div>
		</section>
		
	</div>
</form>	
</body>
</html>