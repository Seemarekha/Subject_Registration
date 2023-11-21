<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/STUDENT/Registered_Subject_css/Registered_subject.css">
<link rel="stylesheet" href="CSS/STUDENT/Registered_Subject_css/Registered_subject1.css">
<link rel="stylesheet" href="CSS/STUDENT/Registered_Subject_css/Registered_subject2.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>

<title>Sliding Modal Box Style</title>

</head>
<body>
 <div class="hero">
            <nav>
                <img src="https://thegttech.com/img/icon/cutm_logo.png" class="logo">
                <div>
                    <span class="logos">Subject Registration</span>
                </div>
                
                <img src="images/user.png" class="user-pic" onclick="toggleMenu()">
                <div class="sub-menu-wrap" id="subMenu">
                    <div class="sub-menu">
                        <div class="user-info">
                            <img src="images/user.png">
                            <h3>User</h3>
                        </div>
                        <hr>
                        <a href="#" class="sub-menu-link">
                            <img src="images/profile.png">
                            <p>Edit profile</p>
                            <span>></span>
                        <a href="#" class="sub-menu-link">
                            <img src="images/logout.png">
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
                        <a href="StdCtrl">
                            <i class='bx bxs-dice-1'></i>
                            <span class="link_name">Semester - 1</span>
                        </a>    
                    </li>
                
                    <li>
                        <a href="StdCtrl2">
                            <i class='bx bxs-dice-2'></i>
                            <span class="link_name">Semester - 2</span>
                        </a>    
                    </li>
               
                    <li>
                        <div class="icon-link">
                            <a href="#">
                                <i class='bx bxs-dice-3'></i>
                                <span class="sem">Semester - 3</span>
                            </a>
                            <i class='bx bx-chevron-down arrow' ></i>
                        </div>
                        <ul class="sub-menu">
                            <li>
                                <a href="#">DOMAINS :</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_3StCtrl">Software Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_3MlCtrl">Machine Learnning</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_3CdCtrl">Cloud Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_3AvCtrl">AR/VR</a>
                            </li>
                        </ul>
                    </li>
                
                    <li>
                        <div class="icon-link">
                            <a href="#">
                                <i class='bx bxs-dice-4'></i>
                                <span class="sem">Semester - 4</span>
                            </a>
                            <i class='bx bx-chevron-down arrow' ></i>
                        </div>
                        <ul class="sub-menu">
                            <li>
                                <a href="#">DOMAINS </a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_4StCtrl">Software Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_4MlCtrl">Machine Learning</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_4CdCtrl">Cloud Technology</a>
                            </li>
                            <li class="link_name">
                                <a href="Sem_4AvCtrl">AR/VR</a>
                            </li>
                        </ul>
                    </li>
                </div>
                
            </ul>
        </div>

    

    <script src="JAVASCRIPT/STUDENT/Registered_Subject_JS/Registered_subject.js"></script>
    <script src="JAVASCRIPT/STUDENT/Registered_Subject_JS/Registered_subject1.js"></script>

</body>
</html>