<%@page  import = "java.util.List" %>
<%@page import="student.model.*"%>
<%@page import="java.util.Iterator" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/STUDENT/Select_Course_css/Addtional.css">
    <link rel="stylesheet" href="css/STUDENT/Select_Course_css/Select_course.css">
    <title>Student Dashboard</title>
<body>




    <div class="hero">
        <nav>
            <img src="https://thegttech.com/img/icon/cutm_logo.png" class="logo">
            <div>
                <span class="logos">Subject Registration</span>
                <i class='bx bx-x siderbarClose'></i>
            </div>
            
            <img src="Images/user.png" class="user-pic" onclick="toggleMenu()">
            <div class="sub-menu-wrap" id="subMenu">
                <div class="sub-menu">
                    <div class="user-info">
                        <img src="Images/user.png">
                        <h3></h3>
                    </div>
                    <hr>
                    <a href="#" class="sub-menu-link">
                        <img src="Images/profile.png">
                        <p>Edit profile</p>
                        <span>></span>
                    </a>
                    <a href="login.html" class="sub-menu-link">
                        <img src="Images/logout.png">
                        <p>Logout</p>
                        <span>></span>
                    </a>
                </div>
            </div>
        </nav>


        <div class="container">
      <main>
        <ul>
          <div>
          <li>School : SOET</li>
          <li>Registration No. : <%=session.getAttribute("id") %></li>
          <li>Student Name : <%=session.getAttribute("name") %></li>  
          </div>
          
        </ul>
        <ul>
          <div>
            <li>Programe : MCA</li>
          <li>Academic Year &nbsp;: <%=session.getAttribute("academic_year") %></li>
          <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Semester &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <%=session.getAttribute("sem") %> </li>
          </div>
          
        </ul>
    <br><br><br>
    
  <div class="table" align="center">
  <h1>Select Your Subjects</h1>
  


<%
  HttpSession session1=request.getSession();
List<Student_Sub_Regd>  semester = (List<Student_Sub_Regd> )session1.getAttribute("semester");
 %>
 
<table border="1">
  <tr>
    <th>Course_Code</th>
    <th>Course_Name</th>
    <th>Credit</th>
 
  </tr>
  
   <% 
   
   if (semester != null) {
   Iterator<Student_Sub_Regd> iterator = semester.iterator();
   while (iterator.hasNext()) {
	   Student_Sub_Regd std = iterator.next();


     %> 
     <tr>
      <td><%= std.getCourse_code() %></td>
      <td><%= std.getCourse_Name() %></td>
      <td><%= std.getCredit() %></td>
  </tr>
  <% 
    }
} else {
    out.println("Course is null. Check your servlet code.");
}
%>


  
</table><br><br>
<button type="button" class="btn-success" onclick="registerButtonClicked()">Register</button>

<script>
function registerButtonClicked() {
    console.log("Button clicked!");
    window.location.href = 'sucess.jsp';
}
</script>

</div>
</main>
</div>
</div>
</head>


    <script src="JAVASCRIPT/STUDENT/Select_Course_JS/Select_course.js"></script>

</body>
</html>