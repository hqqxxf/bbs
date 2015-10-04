<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>themelist</title>
</head>
<body>
    <c:if test="${!empty themes}">
        <c:forEach items="${themes}" var="theme" varStatus="t">
            ${theme.title}<br>
            ${theme.content}<br>
        </c:forEach>
    </c:if>
</body>
</html>