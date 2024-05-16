package org.example.hibernatepostgresenum;

import org.example.hibernatepostgresenum.constant.FooBar;
import org.example.hibernatepostgresenum.entity.Dummy;
import org.example.hibernatepostgresenum.repository.DummyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest(properties = "spring.datasource.url=jdbc:tc:postgresql:16:///test")
class HibernatePostgresEnumApplicationTests {

  @Autowired private DummyRepository dummyRepository;

  @Test
  void insertDummy() {
    var dummy = new Dummy();
    dummy.setStatus(FooBar.FOO);
    dummyRepository.save(dummy);
  }
}
