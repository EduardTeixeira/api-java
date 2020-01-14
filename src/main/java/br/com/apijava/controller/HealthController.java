package br.com.apijava.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/health")
public class HealthController {

	@RequestMapping(path = "/ping", method = RequestMethod.GET)
	@CrossOrigin
	public String healthTest() {
		return "pong";
	}

}
