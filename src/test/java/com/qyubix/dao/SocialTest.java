package com.qyubix.dao;

import com.github.javafaker.Faker;
import com.qyubix.QyubixApplication;
import com.qyubix.entity.Social;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = QyubixApplication.class)
public class SocialTest {

    @Autowired
    private SocialDao social;

    @Test
    public void testInsert() {
        for(int i = 0; i<100;i++) {
            try {
                Faker faker = new Faker();
                Social s = new Social();
                s.setPost_date(faker.date().past(99999, TimeUnit.DAYS));
                s.setPost_author(faker.name().fullName());
                s.setPost_content(faker.chuckNorris().fact());
                s.setPost_link(faker.company().logo());
                social.save(s);
            }catch (Exception ex){
                continue;
            }
        }
    }
}
