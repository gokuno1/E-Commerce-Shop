package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.ProductService;

@Repository
public interface ProductServiceRepository extends JpaRepository<ProductService, Integer> {

	@Query("select p from ProductService p where p.gender= :gender")
	public List<ProductService> getByGender(@Param("gender")String gender);
	
	@Query("select u from ProductService u where u.productCategory= :productCategory")
	public List<ProductService> getByCategory(@Param("productCategory")String productCategory);
}
