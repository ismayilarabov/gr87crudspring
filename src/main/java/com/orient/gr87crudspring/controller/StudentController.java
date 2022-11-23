package com.orient.gr87crudspring.controller;

import com.orient.gr87crudspring.entity.School;
import com.orient.gr87crudspring.entity.Student;
import com.orient.gr87crudspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/school/students")

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }


    @GetMapping("/school/students/{id}")
    public Student getStudentById(@PathVariable Long id){
      /*  Student data1 = studentRepository.getById(id);
        Student data = new Student();
        data.setId(data1.getId());
        data.setFirstName(data1.getFirstName());
        data.setLastName(data1.getLastName());
        data.setEmail(data1.getEmail());
        */

    return studentRepository.findById(id).get();

    }
    @GetMapping("/school")
    public School getschool(){
        List<Student> students = studentRepository.findAll();
        School sc =  new School();
        sc.setName("Azerbaycan Texniki Universiteti");
        sc.setStudents(students);

        return sc;
    }
}
