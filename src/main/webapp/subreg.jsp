<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Subject Registration</title>
    <link rel="stylesheet" href="css/STUDENT/Std_Sub_reg_css/subreg.css" />
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
    <form action="Std_Sub_Regd_Servlet" method="get">
    <div class="container">
        <div class="contact-form">
          <form action="index.jsp" autocomplete="off">
            <h3 class="title">Registration for Subject</h3>
            <div class="input-container">
              <input type="text" name="std_name" class="input" required="required" />
              <label for="name">Full Name</label>
              <span>Full Name</span>
            </div>
            
            <div class="input-container">
              <input type="number" name="regd_no" class="input" required="required" />
              <label for="email">Registration No</label>
              <span>Registration No</span>
            </div>
            <div class="input-container">
              <select name="semester" id="sem" class="input">
                <option value="blank"></option>
                  <option value="f">first</option>
                  <option value="ss">second</option>
                  <option value="ttt">third(ST)</option>
                  <option value="tttt">third(ML)</option>
                  <option value="ttttt">third(Cloud)</option>
                  <option value="tttttt">third(AR/VR)</option>
                  <option value="fffffff">fourth(ST)</option>
                  <option value="ffffffff">fourth(ML)</option>
                  <option value="fffffffff">fourth(Cloud)</option>
                  <option value="ffffffffff">fourth(AR/VR)</option>
                </select>
              <label for="sem">Semester</label>
              <span>Semester</span>
            </div>
            <div class="input-container">
                <select name="academic_year" id="aca" class="input">
                  <option value="blank"></option>
                    <option value="24">2022-2024</option>
                    <option value="25">2023-2025</option>
                  </select>
                <label for="aca">Academic Year</label>
                <span>Academic Year</span>
              </div>
            
               <input type="submit" name="signin" id="signin"
									class="btn" value="Submit" />
            </form>
        </div>
    </div>
   </form>     
    <script src="js/STUDENT/Std_Sub_reg_JS/subreg.js"></script>
</body>
</html>