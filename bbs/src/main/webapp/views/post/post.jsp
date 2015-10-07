<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ include file="/views/utils.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>bbs论坛模板</title>
<link rel="stylesheet" type="text/css"
	href="../Font-Awesome-3.2.1/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="../css/common.css" />
</head>

<body>
	<c:import url="page-top.jsp"></c:import>

	<div class="container">
		<div class="container-tab" style="width: 100%;">
			<h3>author: XXX</h3>
			<h3>
				<a href="">title</a>
			</h3>
			<p>content............................</p>
			<div style="float: right;">
				<a href=""><i class="icon-heart"></i> 赞</a>&nbsp; <a href=""><i
					class="icon-comment"></i> 点此评论</a>
			</div>
		</div>
		<div class="container-tab" style="width: 80%; float: right;">
			<h3>author: XXX</h3>
			<p>content............................</p>
		</div>
	</div>



	</div>
	</div>

	<script type="text/javascript">
		var module = "post";
	</script>
	<script src="../bower_components/requirejs/require.js"
		type="text/javascript" charset="utf-8" data-main="../js/main.js"></script>
</body>

</html>