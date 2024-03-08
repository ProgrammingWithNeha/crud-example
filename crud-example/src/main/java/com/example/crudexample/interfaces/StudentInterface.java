package com.example.crudexample.interfaces;


import com.example.crudexample.entity.Student;

import java.util.List;

public interface StudentInterface {

     List<Student> fetchAllStudents();
     Student addStudent(Student student);

     Student updateStudent(Student student);

     String deleteStudent(Long id);
}
