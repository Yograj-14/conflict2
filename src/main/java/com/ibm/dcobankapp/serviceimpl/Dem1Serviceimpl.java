package com.ibm.dcobankapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dcobankapp.entity.Dem1;
import com.ibm.dcobankapp.repository.DemRepository;
import com.ibm.dcobankapp.service.DemService;

@Service
public class Dem1Serviceimpl implements DemService{

	@Autowired
	private DemRepository demRepository;
	
	@Override
	public Dem1 addDem1(Dem1 dem1) {
		
		return demRepository.save(dem1);
	}

	@Override
	public List<Dem1> alldem() {
		// TODO Auto-generated method stub
		return demRepository.findAll();
	}

	
}
