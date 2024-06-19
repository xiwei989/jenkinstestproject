package org.test.jenkinstestproject;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinstestprojectApplicationTests {

    public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinstestprojectApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing second log statement...");
        assertEquals(true, true);
    }

}
