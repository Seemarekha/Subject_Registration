<%@page import="java.util.List"%>
<%@page import="Admin.model.StdModel"%>
<%@ page import="java.util.Iterator" %>

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

<%
  HttpSession session1=request.getSession();
  List<StdModel> stdList = (List<StdModel>)session1.getAttribute("stdList");
 %>
<table>
  <tr>
    <th>Student Name</th>
    <th>Regd No</th>
    <th>Semester</th>
    <th>Academic Session</th>
    <th class="action-cell">Action</th>
  </tr>
  
   <% 
   
   if (stdList != null) {
   Iterator<StdModel> iterator = stdList.iterator();
   while (iterator.hasNext()) {
       StdModel std = iterator.next();


     %> 
     <tr>
      <td><%= std.getStd_name() %></td>
      <td><%= std.getStd_regd() %></td>
      <td><%= std.getSemester() %></td>
      <td><%= std.getAcademic_year() %></td>

      <td class="action-cell">
          <button class="btn delete-btn">Delete</button>
    </td>
  </tr>
  <% 
    }
} else {
    out.println("stdList is null. Check your servlet code.");
}
%>


  
</table>

</body>
</html>
