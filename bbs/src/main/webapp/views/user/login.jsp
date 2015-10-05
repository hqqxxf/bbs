<%@ page contentType="text/html; charset=UTF-8"  isELIgnored="false" %>
<%@ include file="/views/utils.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<form action="${ctx }/user/login.do">
	<label for="username">用户名</label>
	<input type="text" name="username" value="" id="username" />
	<label for="password">密码</label>
	<input type="password" name="password" value="" id="password" />
	<input type="submit" name="login" id="login" value="提交" />
</form>

</body>
</html>