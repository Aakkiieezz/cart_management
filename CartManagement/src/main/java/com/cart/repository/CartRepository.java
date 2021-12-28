package com.cart.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cart.entity.Item;

@Repository
public interface CartRepository extends JpaRepository<Item,Integer>
{
	@Query("SELECT i FROM Item i WHERE CONCAT(i.id,i.name,i.price,i.date) LIKE %?1%")
	public List<Item> search(String keyword);
}
