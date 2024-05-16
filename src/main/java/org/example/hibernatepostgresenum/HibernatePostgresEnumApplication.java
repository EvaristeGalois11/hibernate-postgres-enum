package org.example.hibernatepostgresenum;

import org.example.hibernatepostgresenum.constant.FooBar;
import org.example.hibernatepostgresenum.entity.Dummy;
import org.example.hibernatepostgresenum.repository.DummyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernatePostgresEnumApplication {
  public static void main(String[] args) {
    SpringApplication.run(HibernatePostgresEnumApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(DummyRepository dummyRepository) {
    return _ -> {
      var dummy = new Dummy();
      dummy.setStatus(FooBar.FOO);
      dummyRepository.save(dummy);
    };
  }
}
