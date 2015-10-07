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
	<input type="button" name="login" id="login" value="登录" />
</form>


	<script type="text/javascript">
		var module = "login", basePath = "${ctx}";
	</script>
	<script src="${ctx }/views/bower_components/requirejs/require.js"
		type="text/javascript" charset="utf-8"
		data-main="${ctx }/views/js/main.js"></script>
</body>
</html>