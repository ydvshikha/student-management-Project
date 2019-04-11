package com.nuptse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuptse.model.FeeManagement;
import com.nuptse.repository.FeeManagementRepository;

@Service("FeeManagement")
public class FeeManagementServiceImp implements FeeManagementService {
	@Autowired
	private FeeManagementRepository feemanagementRepository;

	@Override
	public FeeManagement findFeeManagementByName(String name) {
		// TODO Auto-generated method stub
		return feemanagementRepository.findByName(name);
	}

	@Override
	public void saveFeeManagement(FeeManagement fee) {
		feemanagementRepository.save(fee);

	}

	@Override
	public List<FeeManagement> findAll() {
		// TODO Auto-generated method stub
		return feemanagementRepository.findAll() ;
	}

}
