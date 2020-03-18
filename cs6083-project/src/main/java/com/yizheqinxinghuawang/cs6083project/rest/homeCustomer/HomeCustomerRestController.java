package com.yizheqinxinghuawang.cs6083project.rest.homeCustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yizheqinxinghuawang.cs6083project.dao.homeCustomer.HomeCustomerDAO;
import com.yizheqinxinghuawang.cs6083project.entity.home.HomeCustomer;

@RestController
@RequestMapping("/api")
public class HomeCustomerRestController {

	private HomeCustomerDAO homeCustomerDAO;

	@Autowired
	public HomeCustomerRestController(HomeCustomerDAO homeCustomerDAO) {
		this.homeCustomerDAO = homeCustomerDAO;
	}

	@GetMapping("/homecustomer")
	public List<HomeCustomer> findAllCustomer() {
		return homeCustomerDAO.findAllCustomer();
	}
}
