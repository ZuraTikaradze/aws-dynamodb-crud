package zura.tikaradze.dynamodb.demo.controller;

import org.springframework.web.bind.annotation.*;
import zura.tikaradze.dynamodb.demo.model.Student;
import zura.tikaradze.dynamodb.demo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/student-controller")
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/persons")
    public List<Student> persons() {
        return studentService.students();
    }

    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
}
