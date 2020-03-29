<%--
  Created by IntelliJ IDEA.
  User: nideeshsurya
  Date: 28/03/20
  Time: 5:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<html>
<head>
    <title>Admission Page</title>
</head>
<body bgcolor="#f08080">
<h1>${headerMessage}</h1>
<form:errors path="studentObj.*"/>
<form action="/SampleSpringMVCApp/submitForm.html" method="post">
    <table align="center">
        <tr><td><h4>Student details</h4></td></tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="studentName"></td>
        </tr>
        <tr>
            <td>Hobby</td>
            <td><input type="text" name="studentHobby"></td>
        </tr>
        <tr>
            <td>Mobile</td>
            <td><input type="text" name="studentMobile"></td>
        </tr>
        <tr>
            <td>Date Of Birth</td>
            <td><input type="text" name="studentDOB"></td>
        </tr>
        <tr>
            <td>Skills</td>
            <td>
                <select name="studentSkills" multiple>
                    <option value="Java Core">Java Core</option>
                    <option value="Machine Learning">Machine Learning</option>
                    <option value="Data Analytics">Data Analytics</option>
                    <option value="Python">Python</option>
                </select>
            </td>
        </tr>
        <tr><td><h4>Student address details</h4></td></tr>
        <tr>
            <td>Country : <input type="text" name="studentAddress.country"/></td>
            <td>State : <input type="text" name="studentAddress.state"/></td>
            <td>City : <input type="text" name="studentAddress.city"/></td>
        </tr>
        <tr>
            <td><input type="submit"  value="Submit Details"></td>
        </tr>
    </table>
</form>

</body>
</html>
