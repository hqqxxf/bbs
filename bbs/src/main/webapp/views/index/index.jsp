<%@ page contentType="text/html; charset=UTF-8"  isELIgnored="false" %>
<%@ include file="/views/utils.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<title>bbs论坛模板</title>
		<link rel="stylesheet" type="text/css" href="${ctx }/views/Font-Awesome-3.2.1/css/font-awesome.min.css" />
		<link rel="stylesheet" type="text/css" href="${ctx }/views/css/common.css" />
	</head>

	<body>	
				<c:import url="page-top.jsp"></c:import>
		
				<div class="container">
					<c:forEach items="${themes }" var="theme" varStatus="t">
					<div class="container-tab">
						<div class="tab-left">
							<div class="title" style="padding: 10px 0;">
								<a href="${ctx }/post/${theme.tid}/list.do">${theme.title }</a>
							</div>
							<div class="tab-icon">
								<i class="icon-eye-open"></i>
								<span>${theme.visitNum }人</span>
								<i class="icon-heart"></i>
								<span>${theme.loveNum }人</span>
								<i class="icon-time"></i>
								<span>${theme.createdDate }</span>
							</div>
						</div>
						<div class="clear"></div>
						<div class="tab-right">
							<p>${theme.revertsNum }</p>
							<p>评论</p>
						</div>
					</div>
					</c:forEach>
					<div class="clear"></div>
				</div>
			</div>
		</div>

		<script type="text/javascript">
			var module = "index",
				basePath = "${ctx }",
				user = "${user.username }";
		</script>
		<script src="${ctx }/views/bower_components/requirejs/require.js" type="text/javascript" charset="utf-8" data-main="${ctx }/views/js/main.js"></script>
	</body>

</html>