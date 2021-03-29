package com.giupviechaotam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaoDongController {
	
	@GetMapping("/quan-ly-lao-dong")
	public String quanLyLaoDong() {
		return "laodong.html";
	}

}
