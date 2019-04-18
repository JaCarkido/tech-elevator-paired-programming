package com.techelevator;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller 
@SessionAttributes("shoppingCart")
public class ShoppingCartItemController {
	
	
	@RequestMapping("/")
		public String displayHomePageList(HttpServletRequest request, HttpSession shoppingCart) {
			request.setAttribute("vegetables", getVegetableList());
			shoppingCart.setAttribute("shoppingCart", new HashMap<String, ShoppingCartItem>());
			return "greeting";
		}
		
	@RequestMapping("/greeting")
	public String displayProductList(HttpServletRequest request) {
		request.setAttribute("vegetables", getVegetableList());
		return "greeting";
	}
	
//	@RequestMapping("productList")
//	public String displayProducts(HttpServletRequest request) {
//		request.setAttribute("vegetables", getVegetableList());
//		
//		return "productList";
//	}
	
	@RequestMapping("/productDetail")
	public String displayProductDetail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			String name = request.getParameter("name");
			request.setAttribute("vegetables", getVegetableByName(name));
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
		
		return "productDetail";
	}

	
	@RequestMapping(path="/productDetail", method=RequestMethod.POST)
	public String processQuantityInput(@RequestParam int quantity,
									   @RequestParam String name,
									   HttpSession session) {
		
		ShoppingCartItem item = new ShoppingCartItem();
		item.setName(name);
		item.setPrice(getPriceByName(name));
		item.setQuantity(quantity);
		
		Map<String, ShoppingCartItem> shoppingCart = (HashMap<String, ShoppingCartItem>)session.getAttribute("shoppingCart");
		if(shoppingCart.containsKey(name)) {
			item.setQuantity(shoppingCart.get(name).getQuantity() + item.getQuantity());
		}
		shoppingCart.put(item.getName(),item);  //should put item in the map but overwrite if .getName() is the same
		
		//()session.getAttribute("shoppingCart");
		
	
		
		return "redirect:/greeting";
	}
	
	@RequestMapping("viewShoppingCart")
	public String viewShoppingCart(HttpSession session, HttpServletRequest request) {
//		Map<String, ShoppingCartItem> shoppingCart = (Map<String, ShoppingCartItem>)session.getAttribute("shoppingCart");
//		
//		request.setAttribute("keys", cartKeySet);
		return "viewShoppingCart";
	}
	
	private Map<String, ShoppingCartItem> createShoppingCart() {
	
		Map<String, ShoppingCartItem> shoppingCart = new HashMap<String, ShoppingCartItem>();
		
		return shoppingCart;
		
	}
	
	
	
	
	
	
	private ShoppingCartItem getVegetableByName(String name) {
		for(ShoppingCartItem v : getVegetableList()) {
			if(v.getName().equals(name)) {
				return v;
			}
		}
		return null;
	}
	
	private List<ShoppingCartItem> getVegetableList() {
		List<ShoppingCartItem> vegetables = new ArrayList<>();
		
		ShoppingCartItem v = new ShoppingCartItem("Heirloom Tomatoes", 4.99);
		v.setImgName("tomatoes");
		vegetables.add(v);
		
		v = new ShoppingCartItem("Carrots", 3.99);
		v.setImgName("carrots");
		vegetables.add(v);
		
		v = new ShoppingCartItem("Cucumbers", 2.99);	
		v.setImgName("cucumbers");
		vegetables.add(v);
		
		v = new ShoppingCartItem("Bell Peppers", 5.99);
		v.setImgName("peppers");
		vegetables.add(v);
		
		v = new ShoppingCartItem("Radishes", 1.99);
		v.setImgName("radishes");
		vegetables.add(v);
		
		return vegetables;
	}
	
public double getPriceByName(String name) {
		Double price =  null;
		List<ShoppingCartItem> itemList = getVegetableList();
		for(ShoppingCartItem item: itemList) {
			if(item.getName().equals(name))
				price = item.getPrice();
		}
		
		return price;
	}
}
