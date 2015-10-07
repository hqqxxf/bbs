<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ include file="/views/utils.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>bbs论坛模板</title>
<link rel="stylesheet" type="text/css"
	href="${ctx }/views/Font-Awesome-3.2.1/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="${ctx }/views/css/common.css" />
</head>

<body>
	<c:import url="../index/page-top.jsp"></c:import>

	<div class="container">
		<div id="theme" class="container-tab" style="width: 100%;">
			<h3>author: ${theme.author.username }</h3>
			<h3>
				<a href="">${theme.title }</a>
			</h3>
			<p>${post.content }</p>
			<div style="float: right;">
				<p>${theme.createdDate }</p>
				<a href=""><i class="icon-heart"></i> 赞</a>&nbsp; <a id="comment"
					href="javascript:void(0)"><i class="icon-comment"></i> 点此评论</a>
			</div>
		</div>
		<c:forEach items="${posts }" var="post" varStatus="t">
			<div id="postDiv" class="container-tab"
				style="display: none; width: 80%; float: right;">
				<textarea id="commentText" name="comment" rows="5" cols="60" value="输入您的评论"></textarea>
				<input type="button" value="提交评论">
			</div>
			<div class="container-tab" style="width: 80%; float: right;">
				<h3>#${t.index+1 } author: ${post.author.username}</h3>
				<p>${post.content}</p>
				<p>${post.createdDate }</p>
			</div>
		</c:forEach>
	</div>
	</div>



	</div>
	</div>

	<script type="text/javascript">
		var module = "post", basePath = "${ctx}";
	</script>
	<script src="${ctx }/views/bower_components/requirejs/require.js"
		type="text/javascript" charset="utf-8"
		data-main="${ctx }/views/js/main.js"></script>
</body>

</html>