<%@ page import="student.model.sem_3Av" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registered Courses</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>

    <style>
        body {
            font-family: Arial, sans-serif;
           
        }

        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                        animation: glow 1s infinite alternate; /* Adding the glow animation */
            
        }

        h1 {
            text-align: center;
           
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        /* Adding the glow animation */
        @keyframes glow {
            from {
                box-shadow: 0 0 10px rgba(0, 255, 0, 0.8); /* Start with a green glow */
            }
            to {
                box-shadow: 0 0 20px rgba(0, 255, 0, 0.8); /* End with a stronger green glow */
            }
        }

        
    </style>
</head>
<body>

<div class="container">
    <h1>Registered Courses</h1>
    
    <table>
        <tr>
            <th>Course Code</th>
            <th>Course Name</th>
            <th>Credits</th>
            <th>Course Type</th>
            <th>Academic Year</th>
        </tr>

        <% 
        List<sem_3Av> list = (List) request.getAttribute("student_data");
        for (sem_3Av model : list) {
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
