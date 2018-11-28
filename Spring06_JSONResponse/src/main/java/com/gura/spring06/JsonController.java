package com.gura.spring06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //컴포넌트 스캔을 하기위한 어노테이션
public class JsonController {
	
	@RequestMapping("/json01")
	public String json01(){
		return "json01";
	}
	
	@RequestMapping("/json02")
	@ResponseBody
	public Map<String,Object> json02() {
		Map<String,Object> map=new HashMap<>();
		map.put("num", 999);
		/*
		 * 1. jackson 라이브러리가 dependncy 에 명시 되어 있고,
		 * 위 메소드에 @ResponseBody 어노테이션이 붙어있고,
		 * servlet-context.xml 에 <annotation-driven/> 
		 * 설정되어 있으면
		 * 
		 * HashMap 객체에 담기니 정보가 아래의 json 형식의 문자열로
		 * 클라이언트에게 응답된다. 
		 * 
		 */
		return map;
	}
}
