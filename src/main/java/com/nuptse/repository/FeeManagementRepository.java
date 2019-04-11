package com.nuptse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nuptse.model.FeeManagement;

@Repository("feemanagementRepository")
public interface FeeManagementRepository extends JpaRepository<FeeManagement, Long> {
	FeeManagement findByName(String name);

}
