package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
    private DemoController controller;

	@Test
	void contextLoads() {
		String result = controller.index();
		assertEquals(result,"Test for Docker");
	}

}
