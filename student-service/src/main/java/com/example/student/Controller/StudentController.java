package com.example.student.Controller;

import com.example.student.VO.ResponseTemplateVO;

import java.util.List;

import com.example.student.Entity.Student;
import com.example.student.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student saveStudent(@RequestBody Student student) {
        
        return studentService.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    public ResponseTemplateVO getStudentWithElective(@PathVariable("id") Long studentId) {
        
        return studentService.getStudentWithElective(studentId);
    }

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId) {
        return studentService.deleteStudentById(studentId);
    }

    @DeleteMapping("/delete/all")
    public String deleteAllStudents() {
        return studentService.deleteAllStudents();
    }

}