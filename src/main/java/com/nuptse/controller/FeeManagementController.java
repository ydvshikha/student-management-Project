package com.nuptse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nuptse.model.FeeManagement;
import com.nuptse.service.FeeManagementService;

@Controller
public class FeeManagementController {
	@Autowired
	private FeeManagementService feemanagementService;
	@RequestMapping(value={"/fee/create"},method = RequestMethod.GET)
	public ModelAndView createFee(){
		ModelAndView modelandview=new ModelAndView();
		FeeManagement feemanagement=new FeeManagement();
		modelandview.addObject(feemanagement);
		modelandview.setViewName("fee/create");
		return modelandview;
	}
	@RequestMapping(value={"fee/list"},method=RequestMethod.GET)
	public ModelAndView feeList(){
		List<FeeManagement> feelist=feemanagementService.findAll();
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("feelist",feelist);
		modelandview.setViewName("fee/list");
		return modelandview;
		
	}
	

}
