package org.test.jenkinstestproject;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinstestprojectApplicationTests {

    public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinstestprojectApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        assertEquals(true, true);
    }

}
