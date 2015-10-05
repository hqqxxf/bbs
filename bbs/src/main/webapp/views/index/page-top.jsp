<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/views/utils.jsp" %>
<div class="wrapper">
			<div class="wrapper-main">
				<div class="nav">
					<div class="logo">
						<img src="${ctx }/views/img/navitor.png" />
					</div>
					<div id="nav">
						<div class="right-content">
							<div class="log-reg">
								<a href="${ctx }/views/user/login.jsp">登录</a>
							</div>
							<div class="log-reg">
								<a href="${ctx }/views/user/register.jsp">注册</a>
							</div>
						</div>
						<div class="nav-content">
							<ul class="ul-nav">
								<li><a href="">首页</a></li>
								<li><a href="">论坛</a></li>
								<li><a href="">关于我们</a></li>
							</ul>
						</div>

					</div>
					<div id="menuIcon" class="hide" style="line-height: 90px; float:right">
						<a href="javascript:void(0)" class="menu">
							<i class="icon-list"></i>
						</a>
					</div>
					<div class="clear"></div>

				</div>
				<div id="navList" class="hide">
					<ul class="bg dropList">
						<li><a href="">首页</a></li>
						<li><a href="">论坛</a></li>
						<li><a href="">关于我们</a></li>
					</ul>
				</div>