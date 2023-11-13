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
    <form action="<%=request.getContextPath() %>/Std_Sub_Regd" method="get">
    <div class="container">
        <div class="contact-form">
          <form action="index.jsp" autocomplete="off">
            <h3 class="title">Registration for Subject</h3>
            <div class="input-container">
              <input type="text" name="name" class="input" required="required" />
              <label for="name">Full Name</label>
              <span>Full Name</span>
            </div>
            
            <div class="input-container">
              <input type="number" name="email" class="input" required="required" />
              <label for="email">Registration No</label>
              <span>Registration No</span>
            </div>
            <div class="input-container">
              <select name="sem" id="sem" class="input">
                <option value="blank"></option>
                  <option value="first">first</option>
                  <option value="second">second</option>
                  <option value="third">third</option>
                  <option value="fourth">fourth</option>
                </select>
              <label for="sem">Semester</label>
              <span>Semester</span>
            </div>
            <div class="input-container">
                <select name="aca" id="aca" class="input">
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