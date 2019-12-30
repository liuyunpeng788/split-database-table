package com.person.multitabledemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.person.multitabledemo.entity.Student0;
import org.springframework.stereotype.Repository;

@Repository
public interface Student0Repository extends JpaRepository<Student0, Integer>, JpaSpecificationExecutor<Student0> {

}