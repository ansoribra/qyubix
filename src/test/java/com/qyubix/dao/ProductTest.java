package com.qyubix.dao;

import com.github.javafaker.Faker;
import com.qyubix.QyubixApplication;
import com.qyubix.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = QyubixApplication.class)
public class ProductTest {

    @Autowired
    private ProductDao product;

    @Test
    public void testInsert() {
        for(int i = 0; i<100;i++) {
            try {
                Faker faker = new Faker();
                Product p = new Product();
                p.setProduct_category(faker.commerce().department());
                p.setProduct_description(faker.lorem().paragraph());
                p.setProduct_discount(faker.number().numberBetween(1, 70));
                p.setProduct_mart_id((faker.company().name()).replaceAll("\\W",""));
                p.setProduct_name(faker.commerce().productName());
                p.setProduct_price(faker.number().numberBetween(5000, 999999999));
                p.setProduct_rating(faker.number().numberBetween(1, 10));
                p.setProduct_sold(faker.number().numberBetween(1, 9999999));
                p.setProduct_discount_after(p.getProduct_price()/(100*p.getProduct_discount()));
                product.save(p);
            }catch (Exception ex){
                continue;
            }
        }
    }
}