package com.key.springboot.service;

import java.util.List;
import java.util.Map;

import com.key.springboot.domain.Notice;

public interface NoticeService {
	List<Notice> findAll();
	
	Map<String,Object> findByPage(Integer page, Integer rows);
}
