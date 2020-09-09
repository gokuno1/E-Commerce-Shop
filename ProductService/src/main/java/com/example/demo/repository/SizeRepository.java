package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.ProductSize;

@Repository
public interface SizeRepository extends JpaRepository<ProductSize, Integer> {
	
	public List<ProductSize> findBySizeId(int sizeId);
	public List<ProductSize> findBySizeValue(String sizeValue);
	
	

}
