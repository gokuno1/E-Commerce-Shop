package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.ProductCategory;

@Repository
public interface CategoryRepository extends CrudRepository<ProductCategory, Integer>{

	@Query(value = "select * from category where category_name= ?1",nativeQuery = true)
	public ProductCategory getByCategoryName(String name);
	
}
