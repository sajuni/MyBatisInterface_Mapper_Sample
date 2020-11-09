package com.seung.hyo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.seung.hyo.dao.SampleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleMapperTest {

	@Autowired
	private SampleMapper mapper;
	
//	@Test
//	public void testTime() {
//		System.out.println("되지");
//		System.out.println(mapper.getClass().getName());
//		System.out.println(mapper.getTime());
//	}
	
//	@Test
//	public void testUser() {
//		
//		String user = mapper.getUser("user01", "user01");
//		
//		System.out.println(user);
//		
//	}
	
	@Test
	public void testUserName() {
		String email = mapper.getUserName("user00", "user00");
		
		System.out.println(email);
	}
	
}
