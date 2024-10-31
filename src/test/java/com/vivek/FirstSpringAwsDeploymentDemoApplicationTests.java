package com.vivek;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstSpringAwsDeploymentDemoApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(FirstSpringAwsDeploymentDemoApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Cases are executing.....");
		assertEquals(true, true);
	}

}
