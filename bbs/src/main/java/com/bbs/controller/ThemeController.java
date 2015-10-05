package com.bbs.controller;

import com.bbs.entity.ThemeEntity;
import com.bbs.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/theme")
public class ThemeController extends MultiActionController{
	
	@Autowired
	private ThemeService themeService;
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response){
		List<ThemeEntity> themes = themeService.getThemeList(0, 20);
		request.setAttribute("themes", themes);
		return new ModelAndView("index/index");
	}

}
