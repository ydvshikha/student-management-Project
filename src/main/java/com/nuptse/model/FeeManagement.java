package com.nuptse.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feemanagement")
public class FeeManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_name")
	private String name;
	@Column(name = "deposit_fee")
	private int depfee;
	@Column(name = "due_fee")
	private int duefee;
	@Column(name = "total_fee")
	private int totalfee;
	@Column(name = "joinedDate")
	private Date joinedDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepfee() {
		return depfee;
	}

	public void setDepfee(int depfee) {
		this.depfee = depfee;
	}

	public int getDuefee() {
		return duefee;
	}

	public void setDuefee(int duefee) {
		this.duefee = duefee;
	}

	public int getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(int totalfee) {
		this.totalfee = totalfee;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
}
