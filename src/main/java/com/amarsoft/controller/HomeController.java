package com.amarsoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 59851
 */
@RestController
public class HomeController {
	Logger logger = org.slf4j.LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/test")
	public String test() {

		System.out.println("33");
		return "hello";
	}
	@RequestMapping("/test4")
	public String test4() {


		return "hello";
	}
	@RequestMapping("/test2")
	public String test2() {
		try {
			List<byte[]> list = new ArrayList<byte[]>();
			/* 每次增加一个1M大小的数组对象 */
			while (true) {
				list.add(new byte[1024 * 1024]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}




}
