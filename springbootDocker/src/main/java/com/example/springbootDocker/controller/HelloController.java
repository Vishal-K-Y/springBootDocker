package com.example.springbootDocker.controller;

import com.example.springbootDocker.Entity.Organization;
import com.example.springbootDocker.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

	@Autowired
	private OrganizationService organizationService;
	
	@GetMapping("/home")
	public String homepage() {
		System.out.println("homepage called...");
		return "This is the homepage";
	}

	@GetMapping("/listOfOrgs")
	public List<Organization> getOrganization() {
		System.out.println("list displayed...");
		return organizationService.getOrganizations();
	}
}
