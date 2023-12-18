package com.StudentCRUD.operations.example.springBoot.Service;

import com.StudentCRUD.operations.example.springBoot.Repository.StudentRepository;
import com.StudentCRUD.operations.example.springBoot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceClass implements StudentServiceInterface{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student createStudentData(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public List<Student> getStudentsData(Student student) {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentDataByUSN(String usn) {
        return studentRepository.findById(usn).get();
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteByUSN(String usn) {
        studentRepository.deleteById(usn);
        return "Your record is deleted broo :-( " +
                "byee byee!!";
    }

}
