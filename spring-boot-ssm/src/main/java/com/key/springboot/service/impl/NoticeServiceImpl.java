package com.key.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.key.springboot.domain.Notice;
import com.key.springboot.mapper.NoticeMapper;
import com.key.springboot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String, Object> map=new HashMap<>();
		
		Long count=noticeMapper.count();
		
		map.put("total", count);
		
		List<Notice> notices=noticeMapper.findByPage(page, rows);
		
		map.put("rows", notices);
		
		return map;
	}

}
