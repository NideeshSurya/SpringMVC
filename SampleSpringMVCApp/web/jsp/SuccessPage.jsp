<%--
  Created by IntelliJ IDEA.
  User: nideeshsurya
  Date: 28/03/20
  Time: 8:37 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>${headerMessage}</h1>
<h1>Successfully applied with below details</h1>
<h4>Student Name : </h4> <h2>${student.studentName}</h2>
<h4>Student Hobby : </h4> <h2>${student.studentHobby}</h2>

<table>
    <tr>
        <td>Student Name :</td>
        <td>${student.studentName}</td>
    </tr>
    <tr>
        <td>Hobby :</td>
        <td>${student.studentHobby}</td>
    </tr>
    <tr>
        <td>Mobile :</td>
        <td>${student.studentMobile}</td>
    </tr>
    <tr>
        <td>Date Of Birth :</td>
        <td>${student.studentDOB}</td>
    </tr>
    <tr>
        <td>Student Skills :</td>
        <td>${student.studentSkills}</td>
    </tr>
</table>
<h4>${details}</h4>
</body>
</html>
