package com.akulaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.akulaClasses.DMS.Models.Dog;


/**
*Manasa Akula
*/
public interface DogRepository  extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
