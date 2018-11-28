package com.gura.spring06;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//(name="data") ==> xml 페이지의 <data> <num>999</num></data>를 가리킴

@XmlRootElement(name="data")
public class Data {
	private int num;
	private String name;
	private String addr;
	/*public Data(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}*/
	public int getNum() {
		return num;
	}
	@XmlElement
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	@XmlElement
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

	
	
}
