package zura.tikaradze.dynamodb.demo.service;

import zura.tikaradze.dynamodb.demo.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> students();

    void addStudent(Student student);
}
