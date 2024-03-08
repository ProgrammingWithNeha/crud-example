package com.example.crudexample.services;

import com.example.crudexample.entity.Student;
import com.example.crudexample.interfaces.StudentInterface;
import com.example.crudexample.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService implements StudentInterface {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> fetchAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student obj=studentRepo.findById(student.getId()).get();
        obj.setStudentName(student.getStudentName());
        obj.setStudentClass(student.getStudentClass());
        obj.setStudentDiv(student.getStudentDiv());
        obj.setStudentRollNo(student.getStudentRollNo());
        studentRepo.save(obj);
        return obj;
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        return "deleted successfully..";
    }
}
