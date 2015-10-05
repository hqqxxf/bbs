<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>postlist</title>
</head>
<body>
	<c:if test="${!empty theme }">
		<div id="theme">
			<div id="title">${theme.title }  by ${theme.author.username }</div>
			<div id="content">${theme.content }</div>
		</div><br>
	</c:if>
	<c:if test="${!empty posts }">
		<c:forEach items="${posts }" var="post" varStatus="t">
			${post.content } <br>
			#${t.index+1 }<br>
			${post.createdDate }<br>
			<c:if test="${!empty post.author }">
			${post.author.username }<br>
			<br>
			</c:if>
		</c:forEach>
	</c:if>
</body>
</html>