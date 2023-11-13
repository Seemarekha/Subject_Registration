
<%@page import="student.model.Regd_Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/STUDENT/Std_Dash_css/style.css">
    <link rel="stylesheet" href="css/STUDENT/Std_Dash_css/swiper-bundle.min.css">
    <title>Student Dashboard</title>
<body>
<% Regd_Login user=(Regd_Login)request.getAttribute("std_regd");
         //out.print(user);
%>

    <div class="hero">
        <nav>
            <img src="https://thegttech.com/img/icon/cutm_logo.png" class="logo">
            <div>
                <span class="logos">Subject Registration</span>
                <i class='bx bx-x siderbarClose'></i>
            </div>
            
            <img src="images/user.png" class="user-pic" onclick="toggleMenu()">
            <div class="sub-menu-wrap" id="subMenu">
                <div class="sub-menu">
                    <div class="user-info">
                        <img src="images/user.png">
                    
                    </div>
                    <hr>
                    <a href="#" class="sub-menu-link">
                        <img src="images/profile.png">
                        <p>Edit profile</p>
                        <span>></span>
                    </a>
                    <a href="std_login.jsp" class="sub-menu-link">
                        <img src="images/logout.png">
                        <p>Logout</p>
                        <span>></span>
                    </a>
                </div>
            </div>
        </nav>
    </br>
</br>
</br>
<br/>
<br/>
<br/>
<br/>
<br/>
    <div class="slide-container swiper">
        <div class="slide-content">
            <div class="card-wrapper swiper-wrapper">
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://www.pngfind.com/pngs/m/670-6706437_registration-icon-png-transparent-png.png" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>SUBJECT REGISTRATION</b></h2>
                        <a href="subreg.jsp" class="button">Register Here</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://d9hhrg4mnvzow.cloudfront.net/get.edmentum.com/courseware-getting-started-resources/8b6d59d5-b2s-resource-icon_10dy094000000000000028.png" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>REGISTRATION COURSEWARE</b></h2>
                        <a href="Select_courseware.jsp" class="button">Courseware</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://tse4.mm.bing.net/th?id=OIP.hoIKm99wHmpDBdhSUgbrIQAAAA&pid=Api&P=0&h=180" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>REGISTERED SUBJECT</b></h2>
                        <a href="Registered_subject.jsp" class="button">Registered</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://tse1.mm.bing.net/th?id=OIP.n53QS5fhlSg2jFNgUNa2UgHaIr&pid=Api&P=0&h=180" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>ABOUT</b></h2>
                        <a href="About.jsp" class="button">About</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://tse2.mm.bing.net/th?id=OIP.5BHmHCqrJQ-a9dDjlNHjdgHaHa&pid=Api&P=0&h=180" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>CONTACT</b></h2>
                        <a href="Contact.jsp" class="button">Contact</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src= "C:\Users\alokk\Pictures\project\th.jpeg" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>HELP</b></h2>
                        <a href="#" class="button">Help</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="swiper-button-next swiper-navBtn"></div>
        <div class="swiper-button-prev swiper-navBtn"></div>
        <div class="swiper-scrollbar"></div>
        <div class="swiper-pagination"></div>
    </div>
</div>

</head>

    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
    <script src="js/STUDENT/Student_Dashboard_JS/script.js"></script>
    <script src="js/STUDENT/Student_Dashboard_JS/swiper-bundle.min.js"></script>
    <script>
        let subMenu = document.getElementById("subMenu");
        function toggleMenu()
        {
            subMenu.classList.toggle("open-menu");
        }
    </script>
</body>
</html>