package com.cart.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cart.entity.Item;
import com.cart.repository.CartRepository;

@Service
public class CartService
{
	@Autowired
	private CartRepository repo;

	public void addItem(Item i)
	{
		repo.save(i);
	}

	public List<Item> getAllItems(String keyword)
	{
		if(keyword!=null)
			return repo.search(keyword);
		return repo.findAll();
	}

	public Item getItemByID(int id)
	{
		Optional<Item> i = repo.findById(id);
		return i.get();
	}
//	public Optional<Item> getItemByID(int id)
//	{
//		return repo.findById(id);
//	}

	public void deleteItemByID(int id)
	{
		repo.deleteById(id);
	}
}
