package com.lm.dao;

import com.github.pagehelper.Page;
import com.lm.model.ExXzzfBusiness;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ExXzzfBusinessMapper {

    int deleteByPrimaryKey(String id);

    int insert(ExXzzfBusiness record);

    int insertSelective(ExXzzfBusiness record);


    ExXzzfBusiness selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ExXzzfBusiness record);

    int updateByPrimaryKey(ExXzzfBusiness record);

	List<ExXzzfBusiness> findAll()throws Exception;

	int countItem();

	Page<ExXzzfBusiness> findByPage();
}