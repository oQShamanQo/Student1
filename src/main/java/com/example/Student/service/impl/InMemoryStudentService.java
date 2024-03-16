package com.example.Student.service.impl;

import com.example.Student.model.Student;
import com.example.Student.repository.InMemoryDAO;
import com.example.Student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {
    private final InMemoryDAO repository;
    @Override
    public List<Student> findAllStudent() {
            return repository.findAllStudent();
        }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
repository.deleteStudent(email);
    }
}
