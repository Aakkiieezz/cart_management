package cart.cart_management.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cart.cart_management.entity.Item;
import cart.cart_management.repository.CartRepository;

@Service
public class CartService
{
	@Autowired
	private CartRepository repo;

	public List<Item> getAllItems(String keyword)
	{
		//		System.out.println("Inside Service class -> getAllItems method");
		if(keyword!=null)
			return repo.search(keyword);
		return repo.findAll();
	}

	public Item getItemByID(int id)
	{
		//		System.out.println("Inside Service class -> getItemByID method");
		Optional<Item> i = repo.findById(id);
		return i.get();
	}

	public void addItem(Item i)
	{
		//		System.out.println("Inside Service class -> addItem method");
		repo.save(i);
	}

	public void deleteItemByID(int id)
	{
		//		System.out.println("Inside Service class -> deleteItemByID method");
		repo.deleteById(id);
	}
}
