package com.seung.hyo.dao;

import java.util.Map;

public class SampleProvider {

	public static String searchUserName(Map<String, Object> params) {
		
		String searchFront = 
				"select uname " + "from tbl_user " + "where 1 = 1";
		
		if (params.get("type").equals("id")) {
			searchFront += "and uid = #{keyword}";
		}
		
		return searchFront;
	}
	
}
