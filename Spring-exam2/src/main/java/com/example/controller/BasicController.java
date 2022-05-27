 package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.controller.form.IndexForm;
import com.example.entity.Product;

@Controller
public class BasicController {
    @RequestMapping("/index")
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
    	List<Product> list = new ArrayList<Product>(); 
    	Product product1 = new Product(101, "鉛筆", 50);
    	Product product2= new Product(102, "消しゴム", 100);
    	list.add(product1);
    	list.add(product2);
    	model.addAttribute("list", list);
        return "index"; 
    }
    
    @RequestMapping("/result")
    public String result(@ModelAttribute("index") IndexForm form, Model model) {
    	List<Product> list = new ArrayList<Product>(); 
    	Product product1 = new Product(101, "鉛筆", 50);
    	Product product2= new Product(102, "消しゴム", 100);
    	list.add(product1);
    	list.add(product2);
    	
    	for (Product product : list) {
    		if(form.getProductId().equals(product.getProductId())) {
        		model.addAttribute("name", form.getName());
        		model.addAttribute("product", product);
        	}
    	}
    	return "result";
    }
}