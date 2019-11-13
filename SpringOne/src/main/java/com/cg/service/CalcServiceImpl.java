package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.model.BowBean;
@Service
public class CalcServiceImpl implements CalcService {

	public int sum(BowBean bean) {
		return (bean.getNum1()+bean.getNum2());
		
		
	}

	public String view(BowBean bean) {
	return bean.getName();
	}

}
