<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 26.09.2023
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <jsp:useBean id="student" scope="request" type="com.example.lecture2609.beans.Student"/>
    <h1>Hello, ${student.name}!</h1>
    <h2>Возраст студента: ${student.age}</h2>
</body>
</html>
