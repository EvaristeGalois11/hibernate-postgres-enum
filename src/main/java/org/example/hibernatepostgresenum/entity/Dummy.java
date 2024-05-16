package org.example.hibernatepostgresenum.entity;

import jakarta.persistence.*;
import org.example.hibernatepostgresenum.constant.FooBar;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
public class Dummy {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @JdbcTypeCode(SqlTypes.NAMED_ENUM)
  private FooBar status;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public FooBar getStatus() {
    return status;
  }

  public void setStatus(FooBar status) {
    this.status = status;
  }
}
