<%@ page contentType="text/html; charset=UTF-8"  isELIgnored="false" %>
<%@ include file="/views/utils.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>bbsè®ºåæ¨¡æ¿</title>

</head>
<body>
    <header>
        	注册
    </header>

    <div>
    	<form action="${ctx }/user/login.do">
			<label for="username">用户名</label>
			<input type="text" name="username" value="" id="username" />
			<label for="password">密码</label>
			<input type="password" name="password" value="" id="password" />
			<label for="confirmpassword">密码</label>
			<input type="password" name="confirmpassword" value="" id="confirmpassword" />
			<input type="submit" name="login" id="login" value="提交" />
		</form>
    </div>
</body>
</html>