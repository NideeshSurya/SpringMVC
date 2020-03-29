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
<body bgcolor="#008b8b">
<h1>${headerMessage}</h1>
<h1>Successfully applied with below details</h1>
<table align="center">
    <tr><td><h4>Student Details</h4></td></tr>
    <tr>
        <td>Student Name :</td>
        <td>${studentObj.studentName}</td>
    </tr>
    <tr>
        <td>Hobby :</td>
        <td>${studentObj.studentHobby}</td>
    </tr>
    <tr>
        <td>Mobile :</td>
        <td>${studentObj.studentMobile}</td>
    </tr>
    <tr>
        <td>Date Of Birth :</td>
        <td>${studentObj.studentDOB}</td>
    </tr>
    <tr>
        <td>Student Skills :</td>
        <td>${studentObj.studentSkills}</td>
    </tr>
    <tr><td><h4>Address Details</h4></td></tr>
    <tr>
        <td>
            <p><b>${studentObj.studentName}</b> is from ${studentObj.studentAddress.city},
                ${studentObj.studentAddress.state}, ${studentObj.studentAddress.country}.</p>
        </td>
    </tr>
</table>
</body>
</html>
