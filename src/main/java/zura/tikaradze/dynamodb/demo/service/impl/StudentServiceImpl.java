package zura.tikaradze.dynamodb.demo.service.impl;

import org.springframework.stereotype.Service;
import zura.tikaradze.dynamodb.demo.model.Student;
import zura.tikaradze.dynamodb.demo.repository.StudentRepository;
import zura.tikaradze.dynamodb.demo.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> students() {
        return studentRepository.students();
    }

    @Override
    public void addStudent(Student student) {
        this.studentRepository.addStudent(student);
    }
}
