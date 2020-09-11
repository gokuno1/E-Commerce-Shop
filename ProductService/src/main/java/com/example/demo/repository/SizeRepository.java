package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.ProductSize;

@Repository
public interface SizeRepository extends CrudRepository<ProductSize, Integer> {
	
	public List<ProductSize> findBySizeId(int sizeId);
	
	@Query(value = "SELECT * FROM product_size_value where size_name= ?1", nativeQuery = true)
	public ProductSize findBySizeValue(String sizeValue);
	
	

}
