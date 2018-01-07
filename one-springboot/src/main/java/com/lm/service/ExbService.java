package com.lm.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.lm.model.ExXzzfBusiness;

public interface ExbService {

	List<ExXzzfBusiness> findAll();
	List<ExXzzfBusiness> findItemByPage(int currentPage,int pageSize) ;
	Page<ExXzzfBusiness> findByPage(int pageNo, int pageSize);

}
