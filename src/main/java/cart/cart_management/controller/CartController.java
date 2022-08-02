package cart.cart_management.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import cart.cart_management.entity.Item;
import cart.cart_management.service.CartService;

@Controller
@RequestMapping("/api/items")
public class CartController
{
	@Autowired
	private CartService service;

	@GetMapping("/")
	public String home(Model m, @Param("keyword") String keyword)
	{
		List<Item> itemsList = service.getItems(keyword);
		m.addAttribute("itemsListMapping", itemsList);
		m.addAttribute("keyword", keyword);
		return "homePage";
	}

	@GetMapping("/createItemPage")
	public String createItemForm()
	{
		return "createItemPage";
	}

	@PostMapping("/createItem")
	public String createItem(@ModelAttribute Item i, HttpSession session)
	{
		service.createItem(i);
		session.setAttribute("msg", "Item Added Successfully...!");
		return "redirect:/api/items/";
	}

	@GetMapping("/updateItemPage/{id}")
	public String editItem(@PathVariable int id, Model m)
	{
		Item i = service.getItem(id);
		m.addAttribute("singleItem", i);
		return "updateItemPage";
	}

	// using same service method for addItem
	// cannot use @PutMappig because html <form> method supports only get, post
	@PostMapping("/updateItem")
	public String updateItem(@ModelAttribute Item i, HttpSession session)
	{
		service.createItem(i);
		session.setAttribute("msg", "Item Updated Successfully...!");
		return "redirect:/api/items/";
	}

	// cannot use @DeleteMapping because thymeleaf sends data via GET method
	@GetMapping("/deleteItem/{id}")
	public String deleteItem(@PathVariable int id, HttpSession session)
	{
		service.deleteItem(id);
		session.setAttribute("msg", "Item Deleted Successfully...!");
		return "redirect:/api/items/";
	}
}