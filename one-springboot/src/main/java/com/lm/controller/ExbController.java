package com.lm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.lm.model.ExXzzfBusiness;
import com.lm.page.PageInfo;
import com.lm.service.ExbService;

@Controller
@RequestMapping("/exb")
public class ExbController {

	@Autowired
	private ExbService exbService;

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public @ResponseBody
	String ejson() {

		// ExXzzfBusiness object =new ExXzzfBusiness();
		List<ExXzzfBusiness> oblist = new ArrayList<ExXzzfBusiness>();
		oblist = exbService.findAll();
		return JSON.toJSONString(oblist);
	}
	
	
	@RequestMapping(value = "/jsonpage", method = RequestMethod.GET)
	public  @ResponseBody String itemsPage(){
      
		List<ExXzzfBusiness> oblist = new ArrayList<ExXzzfBusiness>();
		oblist = exbService.findItemByPage(2,10);
		return JSON.toJSONString(oblist);
    
	}	
	
	@RequestMapping(value = "/jsonpagetwo", method = RequestMethod.GET)
	public  @ResponseBody String itemsPagetwo(int pageSize ,int pageNo){
      
		Page<ExXzzfBusiness> exXzzfBusinesses =exbService.findByPage(pageNo,pageSize);
		PageInfo<ExXzzfBusiness> pageInfo = new PageInfo<>(exXzzfBusinesses);
		Assert.notNull(exXzzfBusinesses);
		return  JSON.toJSONString(pageInfo);
	}	
	

}
