package com.tcs.springmvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springmvc.entity.Productentity;


@Repository
public interface Productrepository extends JpaRepository<Productentity, Long>  {

}
