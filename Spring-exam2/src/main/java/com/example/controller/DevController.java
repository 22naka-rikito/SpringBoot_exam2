 package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.controller.form.IndexForm;
import com.example.entity.User;

@Controller
public class DevController {
	@RequestMapping("/index")
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
        return "index"; 
    }
	
    @RequestMapping("/login")
    public String login(@ModelAttribute("index") IndexForm form, Model model) {
        return "login"; 
    }
    
    @RequestMapping("/menu")
    public String result(@ModelAttribute("index") IndexForm form, Model model) {
    	List<User> list = new ArrayList<User>(); 
    	User user1 = new User("axizuser", "axiz");
    	User user2 = new User("sato", "pass01");
    	list.add(user1);
    	list.add(user2);
    	
    	for (User user : list) {
    		if(form.getLoginId().equals(user.getUserId()) && form.getPassword().equals(user.getPassword())) {
    			return "menu";
        	}
    	}
    	return "login";
    }
}