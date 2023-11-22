<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Registered Student List</title>
  <link rel="stylesheet" href="CSS/ADMIN/Registered_student_css/Registered_student_list.css"/>
</head>
<body>
<div>
  <h1>Registered Student List</h1>
</div>

<table>
  <tr>
    <th>Student Name</th>
    <th>Regd No</th>
    <th>Semester</th>
    <th>Academic Session</th>
    <th class="action-cell">Action</th>
  </tr>
  
  <tr>
    <td>Sutun</td>
    <td>220720100266</td>
    <td>3rd</td>
    <td>2022-2024</td>
    <td class="action-cell">
      <button class="btn edit-btn">Edit</button>
      <button class="btn delete-btn">Delete</button>
    </td>
  </tr>
  
  <!-- Add more rows as needed -->

</table>

</body>
</html>
