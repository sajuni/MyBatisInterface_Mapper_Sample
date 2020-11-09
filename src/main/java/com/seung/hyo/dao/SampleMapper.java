package com.seung.hyo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

public interface SampleMapper {

	@Select("select now()")
	public String getTime();
	
	// 다중 파라미터 처리
	@Select("select uname from tbl_user" +
			" where uid = #{uid} and upw = #{upw}")
	public String getUser( 
		@Param("uid") String uid,
		@Param("upw") String upw);

	// xml을 이용한 방식
	public String getUserName(
		@Param("id")String id,
		@Param("pw")String pw);
	
	// SelectProvider를 이용한 방식
	@SelectProvider(type=SampleProvider.class, method="searchUserName")
	public String search(
			@Param("type")String type,
			@Param("keyword")String keyword);
	
}
