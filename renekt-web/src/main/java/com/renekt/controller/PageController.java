package com.renekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jip
 * @version 1.0
 * @date 2018/12/31
 */
@Controller
@RequestMapping("/")
public class PageController {

	@RequestMapping("/hello")
	@ResponseBody
	public String toPage() {
		return "hello world";
	}
}
