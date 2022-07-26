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
import cart.cart_management.entity.Item;
import cart.cart_management.service.CartService;

@Controller
public class CartController
{
	@Autowired
	private CartService service;

	@GetMapping("/")
	public String home(Model m, @Param("keyword") String keyword)
	{
		//		System.out.println("Inside CartController class -> home method");
		List<Item> itemsList = service.getAllItems(keyword);
		m.addAttribute("itemsListMapping", itemsList);
		m.addAttribute("keyword", keyword);
		return "homePage";
	}

	@GetMapping("/addItemPage_mapping")
	public String addItemForm()
	{
		//		System.out.println("Inside CartController class -> addItemForm method");
		return "addItemPage";
	}

	@PostMapping("/addItem_mapping")
	public String itemRegister(@ModelAttribute Item i, HttpSession session)
	{
		//		System.out.println("Inside CartController class -> itemRegister method");
		service.addItem(i);
		session.setAttribute("msg", "Item Added Successfully...!");
		return "redirect:/";
	}

	@GetMapping("/updateItemPage_mapping/{id}")
	public String editItem(@PathVariable int id, Model m)
	{
		//		System.out.println("Inside CartController class -> editItem method");
		Item i = service.getItemByID(id);
		m.addAttribute("singleItem", i);
		return "updateItemPage";
	}

	@PostMapping("/updateItem_mapping")
	public String updateItem(@ModelAttribute Item i, HttpSession session)
	{
		//		System.out.println("Inside CartController class -> updateItem method");
		service.addItem(i);
		session.setAttribute("msg", "Item Updated Successfully...!");
		return "redirect:/";
	}

	@GetMapping("/deleteItem_mapping/{id}")
	public String deleteItem(@PathVariable int id, HttpSession session)
	{
		//		System.out.println("Inside CartController class -> deleteItem method");
		service.deleteItemByID(id);
		session.setAttribute("msg", "Item Deleted Successfully...!");
		return "redirect:/";
	}
}