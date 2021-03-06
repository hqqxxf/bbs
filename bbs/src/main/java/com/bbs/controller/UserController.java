package com.bbs.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.alibaba.fastjson.JSONObject;
import com.bbs.entity.UserEntity;
import com.bbs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends MultiActionController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserEntity user = userService.getUser(username, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			Cookie cookie = new Cookie("username", username);
			cookie.setPath("/");
			cookie.setMaxAge(7 * 24 * 60 * 60);
			response.addCookie(cookie);
		}
		JSONObject json = new JSONObject();
		json.put("user", user);
		try {
			response.getWriter().print(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
