<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="semester.css">
<title>Insert title here</title>
</head>
<body>

	<input type="hidden" id="status" value="<%= request.getAttribute("status")%>">

	  <div class="wrapper">
    <h2>Add Course For Semester-2 </h2>
    
    
    <form action="SecondSemCtrl" method="post" autocomplete="off">
      
      
      <div class="input-box">
        <input type="text" placeholder="Course Code" name="CourseCode" required="required">
      </div>
      <div class="input-box">
        <input type="text" placeholder="Course Name" name="CourseName" required="required">
      </div>
      <div class="input-box">
        <input type="number" placeholder="Credits" name="Credits" required="required">
      </div>
      <div class="input-box">
        <input type="text" placeholder="Course Type" name="CourseType" required="required">
      </div>
      <div class="input-box">
        <input type="text" placeholder="Academic Year" name="AcademicYear" required="required">
      </div>
      <div class="input-box button">
        <a href=""> <input type="Submit" value="Add"></a>
       
      </div>
    </form>
  </div>

</body>
</html>