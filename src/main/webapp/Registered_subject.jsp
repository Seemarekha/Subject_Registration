<%@ page import="student.model.registered_std2" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registered Courses</title>
    <link rel="stylesheet" href="CSS/your_custom_styles.css"> <!-- Add your custom styles here -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>

<div class="container">
    <h1>Registered Courses</h1>
    
    <table class="course-table">
        <tr>
            <th>Course Code</th>
            <th>Course Name</th>
            <th>Credits</th>
            <th>Course Type</th>
            <th>Academic Year</th>
        </tr>

        <% 
        List<registered_std2> list = (List) request.getAttribute("student_data");
        for (registered_std2 model : list) {
        %>
        <tr>
            <td><%= model.getCourseCode() %></td>
            <td><%= model.getCourseName() %></td>
            <td><%= model.getCredits() %></td>
            <td><%= model.getCourseType() %></td>
            <td><%= model.getAcademicYear() %></td>
        </tr>
        <% } %>
    </table>
</div>

<script src="JAVASCRIPT/STUDENT/SelectCourseware_JS/Select_courseware.js"></script>
<script src="JAVASCRIPT/STUDENT/SelectCourseware_JS/Select_courseware1.js"></script>
</body>
</html>
