package com.ibm.dcobankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.dcobankapp.entity.Dem1;

@Repository
public interface DemRepository extends JpaRepository<Dem1,Long>{

}
