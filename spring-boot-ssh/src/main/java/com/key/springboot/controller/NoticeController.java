package com.key.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.key.springboot.entity.Notice;
import com.key.springboot.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
}
