package com.bbs.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.entity.UserEntity;
import com.bbs.utils.StaticVar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.entity.PostEntity;
import com.bbs.entity.ThemeEntity;
import com.bbs.service.PostService;
import com.bbs.service.ThemeService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;
	@Autowired
	private ThemeService themeService;
	
	@RequestMapping("/{id}/list")
	public String list(@PathVariable("id")Integer id, HttpServletRequest request, HttpServletResponse response){
		List<PostEntity> posts = postService.getPostListByThemeId(id, 0, StaticVar.perPageNum);
		ThemeEntity theme = themeService.getByThemeId(id);
		request.setAttribute("theme", theme);
		request.setAttribute("posts", posts);
		return "post/list";
	}

	@RequestMapping("/{tid}/reply")
	public String reply(@PathVariable("tid")Integer tid, HttpServletRequest request, HttpServletResponse response){
		PostEntity postEntity = new PostEntity();
		postEntity.setTheme(themeService.getByThemeId(tid));
		UserEntity user = (UserEntity) request.getSession().getAttribute("user");
		if(user == null){
			return "user/login";
		}
		postEntity.setAuthor(user);
		postEntity.setContent(request.getParameter("content"));
		postEntity.setCreatedDate(new Date());
		postService.postToTheme(postEntity);
		return "success";
	}
	
}
