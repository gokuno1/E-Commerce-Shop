package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CartService;

@Repository
public interface CartRepository extends JpaRepository<CartService, Integer> {

	
    @Modifying
	@Query("update CartService c set c.productQuantity=c.productQuantity+1  where c.productId= :productId")
	public int updateCount(@Param("productId")int productId);

    @Query("select c from CartService c where c.productId= :productId")
	public CartService getbyproductId(@Param("productId")int productId);
	 

}
