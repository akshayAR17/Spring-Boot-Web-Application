package com.StudentCRUD.operations.example.springBoot.Controller;

import com.StudentCRUD.operations.example.springBoot.Service.StudentServiceInterface;
import com.StudentCRUD.operations.example.springBoot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceInterface studentServiceInterface;

    @PostMapping("/storeData")
    public Student storeStudentInfo(@RequestBody Student student) {
        return studentServiceInterface.createStudentData(student);
    }

    @GetMapping("/fetchData")
    public List<Student> getAllStudentsData(Student student) {
        return studentServiceInterface.getStudentsData(student);
    }

    @GetMapping("/fetchDataByUSN/{usn}")
    public Student studentDataByUSN(@PathVariable String usn) {
        return studentServiceInterface.getStudentDataByUSN(usn);
    }

    @PutMapping("/updateStudentData")
    public Student updateStudentInfo(@RequestBody Student student) {
        return studentServiceInterface.update(student);
    }

    @DeleteMapping("/deleteStudentData/{usn}")
    public String deleteStudent(@PathVariable String usn) {
        return studentServiceInterface.deleteByUSN(usn);
    }
}
