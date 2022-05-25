<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
    <body>
        <form action="controller" method="post">
            <input type="hidden" name="command" value="login"><br>
            <input name="login"><br>
            <input type="password" name="password"><br>
            <input type="submit" value="Login"><br>

        </form>

    </body>
</html>