package com.key.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.key.springboot.entity.Notice;
@Repository
public interface NoticeDao extends JpaRepository<Notice, Long>{

}
