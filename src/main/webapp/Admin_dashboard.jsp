<%@page import="Admin.model.AdminModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/ADMIN/Admin_Dashboard_css/Admin_dashboard.css">
    <title>Admin Dashboard</title>
</head>
<body>
<% AdminModel admin = (AdminModel)request.getAttribute("Dashboard");
           //out.print(admin);
%>

    <div class="hero">
        <nav>
            <img src="https://thegttech.com/img/icon/cutm_logo.png" class="logo">
            <div>
                <span class="logos">Subject Registration</span>
                
            </div>
            <div>
                <p class="admin">ADMIN DASHBOARD</p>
            </div>
            
            <img src="C:\Users\hp\Desktop\RakeshSir.jpg" class="user-pic" onclick="toggleMenu()">
            <div class="sub-menu-wrap" id="subMenu">
                <div class="sub-menu">
                    <div class="user-info">
                        <img src=C:\Users\hp\Desktop\RakeshSir.jpg>
                        <h3>Rakesh Kumar Ray</h3>
                    </div>
                    <hr>
                    <a href="#" class="sub-menu-link">
                        <img src="Images/profile.png">
                        <p>Edit profile</p>
                        <span>></span>
                    </a>
                    <a href="AdminLogin.jsp" class="sub-menu-link">
                        <img src="Images/logout.png">
                        <p>Logout</p>
                        <span>></span>
                    </a>
                </div>
            </div>
        </nav>
        <div class="slide-container swiper">
        <div class="slide-content">
            <div class="card-wrapper swiper-wrapper">
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://media.istockphoto.com/photos/clipboard-2-picture-id523582249?k=6&m=523582249&s=612x612&w=0&h=DgUN6POjtnUikoEAjHD_JmmOfwCwEqHE9dnqcJBrhzs=" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>STUDENT REGISTERED LIST</b></h2>
                      <form action="StdRegdListCtrl" method="get">
                        <button class="button">Click</button>
                        </form>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://tse3.mm.bing.net/th?id=OIP.BBjHKH8yN9M_y_Rtkvk3kQHaGD&pid=Api&P=0&h=180" alt="card_Image" class="card-img">
                        </div>
                    </div> 
                    <div class="card-content">
                        <h2 class="name"><b>ADD COURSE</b></h2>
                        <a href="AddCourse.jsp" class="button">Click</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://tse3.mm.bing.net/th?id=OIP.BBjHKH8yN9M_y_Rtkvk3kQHaGD&pid=Api&P=0&h=180" alt="card_Image" class="card-img">
                        </div>
                    </div> 
                    <div class="card-content">
                        <h2 class="name"><b>View COURSE</b></h2>
                        <a href="ViewCourse.jsp" class="button">Click</a>
                    </div>
                </div>
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="https://thumbs.dreamstime.com/b/cartoon-style-mail-notification-monitor-bell-vector-cartoon-style-mail-notification-monitor-bell-vector-248724541.jpg" alt="card_Image" class="card-img">
                        </div>
                    </div>
                    <div class="card-content">
                        <h2 class="name"><b>NOTIFICATIONS</b></h2>
                        <a href="#" class="button">Click</a>
                    </div>
                </div>
            
            </div>
        </div>
    </div>
</div>


    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
    <script src="JAVASCRIPT/ADMIN/Admin_Dashboard_JS/Admin_dashboard.js"></script>
    <script>
        let subMenu = document.getElementById("subMenu");
        function toggleMenu()
        {
            subMenu.classList.toggle("open-menu");
        }
    </script>
    
</body>
</html>


