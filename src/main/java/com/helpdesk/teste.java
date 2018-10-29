package com.helpdesk;

import java.util.HashMap;
import java.util.Map;

public class teste {
	
	public static void main(String[] args) {
		Map<String, Object> param = new HashMap<>();
		param.put("matricula", 23232);
		
		for(Map.Entry<String, Object> pa : param.entrySet()) {
			System.out.println(pa.getValue());
		}
	}

}
