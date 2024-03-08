package com.example.crudexample.controllers;

import com.example.crudexample.entity.Student;
import com.example.crudexample.interfaces.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentInterface studentInterface;
    @GetMapping("/getAllStudent")
    private List<Student> getAll(){
          return studentInterface.fetchAllStudents();
    }

    @PostMapping("/addStudent")
    private Student create(@RequestBody Student student){
         return studentInterface.addStudent(student);
    }

    @PutMapping("/editStudent")
    private Student update(@RequestBody Student student){
         return studentInterface.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    private String delete(@RequestParam Long id){
        return studentInterface.deleteStudent(id);
    }


}
