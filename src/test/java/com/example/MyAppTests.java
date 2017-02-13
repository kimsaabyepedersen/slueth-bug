package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MyAppTests {

	@Autowired
	private MyProperties myProperties;

	@Test
	public void contextLoads() {
		System.out.println(myProperties.getExpiry().get("a").getClass());
	}

}
