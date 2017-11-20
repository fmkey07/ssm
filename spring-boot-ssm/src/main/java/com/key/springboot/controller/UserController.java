package com.key.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.key.springboot.domain.Notice;
import com.key.springboot.service.NoticeService;

@Controller
public class UserController {
	@Autowired
	private NoticeService noticeService; 
	@GetMapping("/user")
	public String user() {
		return "/html/user.html";
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
	
	@GetMapping("/show")
	public String show() {
		return "/html/notice.html";
	}
	
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@RequestParam(value="page",defaultValue="1",required=false)Integer page,@RequestParam(value="rows",defaultValue="10",required=false)Integer rows){
		return noticeService.findByPage((page-1)*rows, rows);
	}
	
	
}
