package com.gura.spring06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //컴포넌트 스캔을 하기위한 어노테이션
public class JsonController {
	
	@RequestMapping("/json08")
	@ResponseBody
	public List<MemberDto> json08(){
		
		List<MemberDto> list=new ArrayList<>();
		/*MemberDto dt = new MemberDto();*/
		/*list.add(dt);*/
		/*new 객체 생성해서 바로 파라미터로 넣어줘도 된다.*/
		list.add(new MemberDto(10,"김구라","노량진"));
		list.add(new MemberDto(20,"해골","영등포"));
		list.add(new MemberDto(30,"뚱띵이","남영"));
		
		return list;
	}

	@RequestMapping("/json07")
	@ResponseBody
	public MemberDto json07() {
		MemberDto dto=new MemberDto(1,"김구라","노량진");
		return dto;
	}
	
	
	@RequestMapping("/json06")
	@ResponseBody
	//[{},{},{}] list 안에 map 형태로...
	public List<Map<String,Object>> json06(){
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		
		List<Map<String,Object>> list=new ArrayList<>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		return list;
	}
	
	
	//Map안에 List {"",[]} 이러한 형태.
	//{} : map | list : [] 
	@RequestMapping("/json05")
	@ResponseBody
	public Map<String, List<String>> json05(){
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		Map<String,List<String>> map=new HashMap<>();
		map.put("names",names );
		return map;
	}
	
	@RequestMapping("/json04")
	@ResponseBody
	public List<String> json04(){
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		return names;
	}
	
	@RequestMapping("/json03")
	@ResponseBody
	public Map<String, Object> json03(){
		Map<String,Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "gura");
		map.put("isMan", true);
		return map;
		
	}
	
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
		 * 2. 위 메소드에 @ResponseBody 어노테이션이 붙어있고,
		 * 3. servlet-context.xml 에 <annotation-driven/> 
		 * 설정되어 있으면
		 * 
		 * HashMap 객체에 담기니 정보가 아래의 json 형식의 문자열로
		 * 클라이언트에게 응답된다. 
		 * 
		 */
		return map;
	}
}
