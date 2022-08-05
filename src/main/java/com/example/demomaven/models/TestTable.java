package com.example.demomaven.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "colors", indexes = { @Index(columnList = "code") })
@SequenceGenerator(name = "colors_id_seq", sequenceName = "colors_id_seq", allocationSize = 1)
public class TestTable {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colors_id_seq")
  private Long id;

  @Column(nullable = false)
  @NotBlank(message = "name cannot be blank.")
  @Size(min = 3, max = 250, message = "name has to be minimum 3 characters characters")
  private String name;

  @Column(nullable = false, length = 9)
  @NotBlank(message = "hexcode cannot be blank.")
  @Size(min = 6, max = 9, message = "hexcode has to be minimum 6 characters.")
  private String hexcode;

  @Column(nullable = false)
  @NotBlank(message = "code cannot be blank.")
  @Size(min = 2, max = 250, message = "code has to be of 2 characters.")
  private String code;

  @Column(nullable = false)
  @NotBlank(message = "code cannot be blank.")
  @Size(min = 2, max = 250, message = "code has to be of 2 characters.")
  private String code2;
}
