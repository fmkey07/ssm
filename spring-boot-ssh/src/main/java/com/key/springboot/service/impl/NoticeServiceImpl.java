package com.key.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.key.springboot.dao.NoticeDao;
import com.key.springboot.entity.Notice;
import com.key.springboot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeDao noyiceDao;
	@Override
	public List<Notice> findAll() {
		return noyiceDao.findAll();
	}

}
