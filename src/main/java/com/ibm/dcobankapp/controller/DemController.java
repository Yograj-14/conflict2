package com.ibm.dcobankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.dcobankapp.entity.Dem1;
import com.ibm.dcobankapp.service.DemService;

@RestController
@RequestMapping("/demurl")
public class DemController {
	
	@Autowired
	private DemService demService;
	
	@PostMapping("/adddem")
	
	public Dem1 addDem1(@RequestBody Dem1 dem1) {
		return demService.addDem1(dem1);
		
		
		
	}
	@GetMapping("/getalldem")
	public List<Dem1>getalldem(){
		return demService.alldem();
	}

}
