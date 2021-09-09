package zura.tikaradze.dynamodb.demo.repository;

import zura.tikaradze.dynamodb.demo.model.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> students();

    void addStudent(Student student);
}
