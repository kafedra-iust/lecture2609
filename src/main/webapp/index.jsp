<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Hello, World!</h1>
    <form method="post" action="hello-servlet">
        <label for="user">Имя:</label>
        <input id="user" type="text" name="user">
        <label for="age">Возраст:</label>
        <input id="age" type="number" name="age">
        <input type="submit" value="Say hello">
    </form>
</body>
</html>