package com.code.generator.util;

public class queryVo {
	private String first;
	private String second;
	public queryVo(){}
	public queryVo(String first)
	{
		this.first = first;
	}
	public queryVo(String first, String second) {
		
		this.first = first;
		this.second = second;
		
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	
}
