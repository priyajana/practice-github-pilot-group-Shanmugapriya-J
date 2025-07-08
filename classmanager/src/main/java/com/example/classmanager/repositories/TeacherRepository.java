package com.example.classmanager.repositories;

import com.example.classmanager.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    // Additional query methods can be defined here if needed
}
