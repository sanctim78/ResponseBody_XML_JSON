package com.gura.spring06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlController {
	@RequestMapping("/xml01")
	public String xml01() {
		return "xml01";
	}
	
	@RequestMapping
	@ResponseBody
	public Data  xml02() {
		Data d=new Data();
		d.setNum(999);
		d.setName("김구라");
		d.setAddr("dfasdf");
		return d;
	}
	
	@RequestMapping
	@ResponseBody
	public Data  xml03() {
		Data d=new Data();
	
		d.setNum(999);
		d.setName("김구라");
		d.setAddr("dfasdf");
		
		return d;
	}
}
