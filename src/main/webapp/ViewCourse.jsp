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
                <span class="logo_name">Registered Subject</span>
            </div>
            <ul class="nav-links">
                
                    <li>
                        <a href="ViewCourseSem1Ctrl">
                            <i ></i>
                            <span class="link_name">Semester - 1</span>
                        </a>    
                    </li>
                
                    <li>
                        <a href="ViewCourseSem2Ctrl">
                            <i ></i>
                            <span class="link_name">Semester - 2</span>
                        </a>    
                    </li>
               
                    <li>
                        <div class="icon-link">
                            <a href="#">
                                <i ></i>
                                <span class="sem">Semester - 3</span>
                            </a>
                             <i class='bx bx-chevron-down arrow' ></i>
                       
                        </div>
                        <ul class="sub-menu">
                            <li>
                                <a href="#">DOMAINS :</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem3_ST">Software Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem3_ML">Machine Learnning</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem3_Cloud">Cloud Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem3_AR_VR">AR/VR</a>
                            </li>
                        </ul>
                    </li>
                
                    <li>
                        <div class="icon-link">
                            <a href="#">
                                <i ></i>
                                <span class="sem">Semester - 4</span>
                            </a>
                            <i class='bx bx-chevron-down arrow' ></i>
                        </div>
                        <ul class="sub-menu">
                            <li>
                                <a href="#">DOMAINS </a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem4_ST">Software Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem4_ML">Machine Learning</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem4_Cloud">Cloud Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="ViewCourseSem4_AR_VR">AR/VR</a>
                            </li>
                        </ul>
                    </li>
                </div>
                
            </ul>
        </div>  
	 <script src="AddCourse.js"></script>
</body>
</html>