package com.fasape.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {
	static int status=0;
	@RequestMapping("/info")
	@ResponseBody
	public String get(){
		int res=status;
		status=0;
		return res+"";
	}
	@RequestMapping("/set/{id}/{status}")
	@ResponseBody
	public String set(@PathVariable("id") String id,@PathVariable("status") Integer status0){
		if("sxg".equals(id)){
			status=status0;
			return "success";
		}else{
			return "none";
		}
	}
}
