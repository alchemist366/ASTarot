<!DOCTYPE html>
<html lang="en">
<#assign uri = "http://java.sun.com/jsp/jstl/core" prefix = "c">
<head>
    <title>sign-in</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>

<form action="/sign-in" method="post">

<#if message??>
    <p>${message}</p>
</#if>

    <span> login <br> </span>
    <input type="text" name="username" placeholder="login"> <br>
    <span> password <br> </span>
    <input type="password" name="password" placeholder="password">
    <br><br>
    <input type="submit">
    <a href="http://localhost:8080/sign-up">
        <input type="button" on value="Зарегистрироваться">
    </a>
    <input type="reset">

</form>
</body>
</html>