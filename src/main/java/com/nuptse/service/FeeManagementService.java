package com.nuptse.service;

import java.util.List;

import com.nuptse.model.FeeManagement;

public interface FeeManagementService {
	 public FeeManagement findFeeManagementByName(String name);
	    public void saveFeeManagement(FeeManagement fee);
	  List<FeeManagement> findAll() ;
		// TODO Auto-generated method stub
	
			

}
