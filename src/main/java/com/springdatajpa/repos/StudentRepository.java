package com.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
