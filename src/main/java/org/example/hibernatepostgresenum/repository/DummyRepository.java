package org.example.hibernatepostgresenum.repository;

import org.example.hibernatepostgresenum.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {}
