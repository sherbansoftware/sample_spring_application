package com.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class SampleAppApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Inside SampleAppApplicationTests");
		assert (true);
	}
}
