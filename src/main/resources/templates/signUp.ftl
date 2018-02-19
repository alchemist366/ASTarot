<!DOCTYPE html>
<html lang="en">
<head>
    <title>sign-up</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>

<body>

<form action="/sign-up" method="post">

<#if message??>
    <p>${message}</p>
</#if>

    <span>login<br></span>
    <input type="text" name="username" placeholder="login"> <br>
    <span>password<br></span>
    <input type="password" name="password" placeholder="password"> <br>
    <span>check password</span> <br>
    <input type="password" name="password2" placeholder="check password"> <br>
    <br><br>
    <input type="submit">
</form>
</body>
</html>