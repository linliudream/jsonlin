package com.lm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lm.dao.ExXzzfBusinessMapper;
import com.lm.model.ExXzzfBusiness;
import com.lm.page.PageBean;
import com.lm.service.ExbService;

@Service
public class ExbServiceImpl implements ExbService {

	@Autowired
	private ExXzzfBusinessMapper exXzzfBusinessMapper;
	
	@Override
	public List<ExXzzfBusiness> findAll() {
		List<ExXzzfBusiness> oblist= new ArrayList<ExXzzfBusiness>();
		try {
			oblist=exXzzfBusinessMapper.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oblist;
	}

	@Override
	public List<ExXzzfBusiness> findItemByPage(int currentPage, int pageSize) {
		
		PageHelper.startPage(currentPage, pageSize);
		List<ExXzzfBusiness> allItems =new  ArrayList<>();
		try {
			allItems = exXzzfBusinessMapper.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}        //全部记录
		 int countNums = exXzzfBusinessMapper.countItem();            //总记录数
		 System.out.println("================================我看看"+countNums);
		 PageBean<ExXzzfBusiness> pageData = new PageBean<>(currentPage, pageSize, countNums);
		 pageData.setItems(allItems);
		 System.out.println("++++++++++++++++"+pageData.getItems().size()+"+1+++"+pageData.getCurrentPage());
		 return pageData.getItems();
	}

	@Override
	public Page<ExXzzfBusiness> findByPage(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
        return exXzzfBusinessMapper.findByPage();
	}
	
	
 
}
