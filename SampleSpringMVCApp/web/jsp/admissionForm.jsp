<%--
  Created by IntelliJ IDEA.
  User: nideeshsurya
  Date: 28/03/20
  Time: 5:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission Page</title>
</head>
<body>
<form action="/SampleSpringMVCApp/submitForm.html" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="studentName"></td>
        </tr>
        <tr>
            <td>Hobby</td>
            <td><input type="text" name="studentHobby"></td>
        </tr>
        <tr>
            <td><input type="submit"  value="Submit Details"></td>
        </tr>
    </table>
</form>

</body>
</html>
