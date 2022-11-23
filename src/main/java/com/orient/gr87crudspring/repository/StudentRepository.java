package com.orient.gr87crudspring.repository;

import com.orient.gr87crudspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
