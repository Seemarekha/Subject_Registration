<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="AddCourse.css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
 
	<div>

        <div class="hero">
            <nav>
                <img src="https://thegttech.com/img/icon/cutm_logo.png" class="logo">
                <div>
                    <span class="logos">Subject Registration</span>
                </div>

                <div>
                    <p class="admin">ADMIN DASHBOARD</p>
                </div>
               
                <img src="C:\Users\alokk\Pictures\Alok\1686988790799.jpg" class="user-pic" onclick="toggleMenu()">
                <div class="sub-menu-wrap" id="subMenu">
                    <div class="sub-menu">
                        <div class="user-info">
                            <img src=C:\Users\alokk\Pictures\Alok\1686988790700.jpg>
                            <h3>Rakesh Kumar Ray</h3>
                        </div>
                        <hr>
                        <a href="#" class="sub-menu-link">
                            <img src="profile.png">
                            <p> Edit profile</p>
                            <span>></span>
                        </a>
                        <a href="AdminLogin.jsp" class="sub-menu-link">
                            <img src="logout.png">
                            <p>Logout</p>
                            <span>></span>
                        </a>
                    </div>
                </div>
            </nav>
        </div>



        <div class="sidebar close">
            <div class="log-details">
                <span class="logo_name">Course Adding</span>
            </div>
            <ul class="nav-links">
                <li>
                    <a href="FirstSem.jsp">
                        <i></i>
                        <span class="link_name">Semester - 1</span>
                    </a>    
                </li>
                <li>
                    <a href="SecondSem.jsp">
                        <i></i>
                        <span class="link_name">Semester - 2</span>
                    </a>    
                </li>
                <li>
                    <div class="icon-link">
                        <a href="#">
                            <i></i>
                            <span class="link_name">Semester - 3</span>
                        </a>
                        <i class='bx bx-chevron-down arrow' ></i>
                    </div>
                    <ul class="sub-menu">
                        <li class="link_name">
                            <a href="#">Domains</a>
                        </li>
                        <li>
                            <a href="ThirdSem_st.jsp">Software Technology</a>
                        </li>
                        <li>
                            <a href="ThirdSem_ml.jsp">Machine Learning</a>
                        </li>
                        <li>
                            <a href="ThirdSem_cloud.jsp">Cloud Technology</a>
                        </li>
                        <li>
                            <a href="ThirdSem_ar_vr.jsp">AR/VR</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <div class="icon-link">
                        <a href="#">
                            <i></i>
                            <span class="link_name">Semester - 4</span>
                        </a>
                        <i class='bx bx-chevron-down arrow' ></i>
                    </div>
                    <ul class="sub-menu">
                        <li class="link_name">
                            <a href="#">Domains</a>
                        </li>
                        <li>
                            <a href="FourthSem_st.jsp">Software Technology</a>
                        </li>
                        <li>
                            <a href="FourthSem_ml.jsp">Machine Learning</a>
                        </li>
                        <li>
                            <a href="FourthSem_cloud.jsp">Cloud Technology</a>
                        </li>
                        <li>
                            <a href="FourthSem_ar_vr.jsp">AR/VR</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
  
	 <script src="AddCourse.js"></script>
</body>
</html>