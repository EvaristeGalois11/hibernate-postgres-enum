package org.example.hibernatepostgresenum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHibernatePostgresEnumApplication {

    public static void main(String[] args) {
        SpringApplication.from(HibernatePostgresEnumApplication::main).with(TestHibernatePostgresEnumApplication.class).run(args);
    }

}
