package com.prast.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

	private static final Logger log = LoggerFactory.getLogger(RestControl.class);

	@RequestMapping("/api")
	public String neo() {
		return "Skill";
	}

}
