package com.person.multitabledemo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student0 implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Long id;

  @Column(name = "student_id", nullable = false)
  private Long studentId;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "age", nullable = false)
  private Integer age;

  
}