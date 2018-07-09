package com.shit.user.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @TODO
 * @author Long
 * @date 2018年5月29日下午3:00:15
 */
public class Demo {
	
	private Object obj = new Object();
	
	public void method1(int i){
		int j=0;
		int sum=j+i;
		Object acb = obj;
		long start = System.currentTimeMillis();
		Map<String,String> map = new HashMap<String,String>();
		List<String> list = new ArrayList<String>();
		List<String> lList = new LinkedList<String>();
		return;
	}
	
	public static void main(String[] args) {
		String s = "key";
		System.out.println(s.hashCode());
	}

}
