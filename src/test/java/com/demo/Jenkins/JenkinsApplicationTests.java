package com.demo.Jenkins;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsApplicationTests {
	
	Logger logger=LoggerFactory.getLogger(JenkinsApplicationTests.class);
	
	@Test
	contextLoads() {
	logger.info("Test Case Executing....");
	logger.info("Test case Executing second log statement");
	assertEquals(true, true);
	}
}
