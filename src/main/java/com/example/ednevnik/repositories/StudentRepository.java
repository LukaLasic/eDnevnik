package com.example.ednevnik.repositories;

import com.example.ednevnik.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
