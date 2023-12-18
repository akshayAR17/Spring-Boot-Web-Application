package com.StudentCRUD.operations.example.springBoot.Service;

import com.StudentCRUD.operations.example.springBoot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentServiceInterface {
    public Student createStudentData(Student student);

    public List<Student> getStudentsData(Student student);

    public Student getStudentDataByUSN(String usn);
    public Student update(Student student);

    String deleteByUSN(String usn);
}
