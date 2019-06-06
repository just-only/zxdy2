package com.zxdy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zxdy.common.ZxdyConstants;
import com.zxdy.model.DyUser;
import com.zxdy.service.DyUserService;
import com.zxdy.serviceimp.DyUserServiceImp;

@Controller
public class DyUserController {
	
	@Autowired
	@Qualifier("userservice")
	private DyUserService dyUserService;
	
	//处理登录请求
	@RequestMapping(value="/zxdy2/login")
	public ModelAndView login(@RequestParam("loginname") String loginname,
			 @RequestParam("password") String password,
			 HttpSession session,
			 ModelAndView mv){
		// 调用业务逻辑组件判断用户是否可以登录
		DyUser user = dyUserService.login(loginname, password);
		if(user != null){
			// 将用户保存到HttpSession当中
			session.setAttribute(ZxdyConstants.USER_SESSION, user);
			System.out.println(loginname+"  "+password);
			// 客户端跳转到main页面
			mv.setViewName("redirect:/main");
		}else{
			// 设置登录失败提示信息
			mv.addObject("message", "登录名或密码错误!请重新输入");
			// 服务器内部跳转到登录页面
			mv.setViewName("forward:/loginForm");
		}
		return mv;
	}
	
	//处理注销请求
	@RequestMapping(value="/logout")
	 public ModelAndView logout(
			 ModelAndView mv,
			 HttpSession session) {
		// 注销session
		session.invalidate();
		// 跳转到登录页面
		//mv.setViewName("redirect:/loginForm");
		return mv;
	}
}
