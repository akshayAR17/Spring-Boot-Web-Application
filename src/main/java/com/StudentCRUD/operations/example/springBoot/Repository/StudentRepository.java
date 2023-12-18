package com.StudentCRUD.operations.example.springBoot.Repository;

import com.StudentCRUD.operations.example.springBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
