package org.ahn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Administrator on 2015-11-25.
 */
@Test
@ContextConfiguration(locations = {"classpath:spring-test-config.xml"})
public class EmailGeneratorTest extends AbstractTestNGSpringContextTests {

    @Autowired
    EmailGenerator emailGenerator;

    @Test
    void testEmailGenerator() {
        String email = emailGenerator.generate();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");
    }
}