package com.test;

import java.util.Map;
import java.util.Set;

import com.baike.BaikeFetch;

public class Test_baike {
	public static void main(String[] args) throws Exception {
		String[] seedArray = {"隆美尔","曼施坦因"};
		Map<String,Set<String>> entities = BaikeFetch.baikeExpand(seedArray);
		for(String key : entities.keySet()){
			System.out.println(key +" "+ entities.get(key).size());
		}
	}
}
