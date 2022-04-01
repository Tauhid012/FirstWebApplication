package com.codeplanet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@Autowired
	TestRestService testRestService;

	@GetMapping("/firstApi")
	public List getFirstApi(HttpServletRequest req) {
		List list = testRestService.getFirstApi(req.getParameter("email"));
		return list;
	}
}