<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 26.09.2023
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tab</title>
</head>
<body>
    <jsp:useBean id="calc" type="com.example.lecture2609.beans.Calculator" scope="request"/>
    <h1>Max Y = ${calc.maxY}</h1>
    <h1>Min Y = ${calc.minY}</h1>
</body>
</html>
