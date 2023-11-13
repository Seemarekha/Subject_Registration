<%@page import="student.model.*"%>
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
          <li> &nbsp; &nbsp;&nbsp;&nbsp; Registration No. : </li>
          <li>Student Name :</li>  
          </div>
          
        </ul>
        <ul>
          <div>
            <li>Programe : MCA</li>
          <li>Academic Year &nbsp;: </li>
          <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Semester &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: 1 </li>
          </div>
          
        </ul>
    </main>
    </div>
    </div>

</head>


    <script src="JAVASCRIPT/STUDENT/Select_Course_JS/Select_course.js"></script>

</body>
</html>