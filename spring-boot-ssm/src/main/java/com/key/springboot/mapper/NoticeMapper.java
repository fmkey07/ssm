package com.key.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.key.springboot.domain.Notice;

@Mapper
public interface NoticeMapper {
	@Select("select * from notice")
	List<Notice> findAll();
	
	Long count();
	
	List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);
}
