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
	
	@RequestMapping("/xml02")
	@ResponseBody
	public Data xml02() {
		
		Data d=new Data();
		d.setNum(999);
		
		return d;
	}
	
	@RequestMapping("/xml03")
	@ResponseBody
	public Data xml03() {
		
		Data d=new Data();
		d.setNum(83847495);
		d.setAddr("Tokyo Shinanomachi");
		d.setName("Daisaku Ikeda");
		return d;
	}
}
