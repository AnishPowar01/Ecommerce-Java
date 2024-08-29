package com.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.wu.dto.UserDTO;
import com.wu.services.ClientService;

@Controller
@RequestMapping("/citizen")
public class ClientController {
    
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/citizenDetails")
	public String getCitizenDetails(Model model)
	{
//		List<UserDTO> details = clientService.getDetails();
//		model.addAttribute("citizenData", details);
//		
		
		   String url = "http://localhost:9090/vaccine/userDetails/10";
		   RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<UserDTO> response = restTemplate.getForEntity(url, UserDTO.class);
	        UserDTO users = response.getBody();

	        // Add the list of users to the model to be rendered in JSP
	        model.addAttribute("citizenData", users);
//	        return "userList"; 
		return "list-citizen";
	}
}
