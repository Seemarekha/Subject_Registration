<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact Form</title>
    <link rel="stylesheet" href="CSS/HOME/Contact_css/Contact.css" />
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>



    <nav>
      <div class="nav-bar">
          <i class='bx bx-menu sidebarOpen' ></i>
          <span class="logo-navLogo">Subject Registration</span>
              <div class="cutmlogo"><a href="#"><img src="https://thegttech.com/img/icon/cutm_logo.png" alt="cutmLogo"></a></div>

          <div class="menu">
              <div class="logo-toggle">
                  <span class="logo"><a href="#">Subject Registration</a></span>
                  <i class='bx bx-x siderbarClose'></i>
              </div>

              <ul class="nav-links">
                  <li><a href="Home.jsp">Home</a></li>
                  <li><a href="#">About</a></li>
                  <li><a href="Contact.jsp">Contact</a></li>
                  <li><a href="feedback.jsp">Feedback</a></li>
              </ul>
            </div>
            <a href="AdminLogin.jsp" class="action_btn">ADMIN</a>
            <a href="std_login.jsp" class="action_btn">LOGIN</a>
        </div>
      </div>
  </nav> 



    <div class="container">
      <span class="big-circle"></span>
      <img src="img/shape.png" class="square" alt="" />
      <div class="form">
        <div class="contact-info">
          <h3 class="title">Let's get in touch</h3>
          <p class="text">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Saepe
            dolorum adipisci recusandae praesentium dicta!
          </p>

          <div class="info">
            <div class="information">
              <img src="img/location.png" class="icon" alt="" />
              <p>Centurion University of Technology and Management, BBSR, Odisha</p>
            </div>
            <div class="information">
              <img src="img/email.png" class="icon" alt="" />
              <p>alokkar1996@gmail.com</p>
            </div>
            <div class="information">
              <img src="img/phone.png" class="icon" alt="" />
              <p>7735888283</p>
            </div>
          </div>

          <div class="social-media">
            <p>Connect with us :</p>
            <div class="social-icons">
              <a href="#">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#">
                <i class="fab fa-instagram"></i>
              </a>
              <a href="#">
                <i class="fab fa-linkedin-in"></i>
              </a>
            </div>
            <p>Search Here :</p>
            <div class="social-icons">
              
              <a href="https://www.google.co.in">
                <i class="fab fa-google"></i>
              </a>
            </div>
           
          </div>
        </div>

        <div class="contact-form">
          <span class="circle one"></span>
          <span class="circle two"></span>

          <form action="index.html" autocomplete="off">
            <h3 class="title">Contact us</h3>
            <div class="input-container">
              <input type="text" name="name" class="input" required="required" />
              <label for="name">Username</label>
              <span>Username</span>
            </div>
            <div class="input-container">
              <input type="email" name="email" class="input" required="required"/>
              <label for="email">Email</label>
              <span>Email</span>
            </div>
            <div class="input-container">
              <input type="number" name="phone" class="input" required="required"/>
              <label for="phone">Phone</label>
              <span>Phone</span>
            </div>
            <div class="input-container textarea">
              <textarea name="message" class="input" required="required"></textarea>
              <label for="message">Message</label>
              <span>Message</span>
            </div>
            <a href="success.jsp" class="btn"><b>Send</b></a>
          </form>
        </div>
      </div>
    </div>

    <script src="JAVASCRIPT/HOME/Contact_JS/Contact.js"></script>
</html>