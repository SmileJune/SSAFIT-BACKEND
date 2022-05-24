package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.TogetherDao;
import com.ssafy.ssafit.model.dto.Together;

@Service
public class TogetherServiceImpl implements TogetherService {

	@Autowired
	private TogetherDao togetherDao;
	
	
	@Override
	public void createTogether(Together together) {
		togetherDao.insertTogether(together);
	}


	@Override
	public List<Together> readTogether() {
		return togetherDao.selectTogether();
	}

}
