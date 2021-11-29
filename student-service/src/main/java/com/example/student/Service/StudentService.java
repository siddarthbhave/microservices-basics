package com.example.student.Service;

import com.example.student.VO.Elective;
import com.example.student.VO.ResponseTemplateVO;
import com.example.student.Entity.Student;
import com.example.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public ResponseTemplateVO getStudentWithElective(Long studentId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student student = studentRepository.findByStudentId(studentId);

        Elective elective = restTemplate.getForObject("http://ELECTIVE-SERVICE/electives/get/" + student.getElectiveId(),
                Elective.class);

        vo.setStudent(student);
        vo.setElective(elective);

        return vo;
    }
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public String deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
        return "Student with Id: " + studentId + " deleted";
    }
    
    public String deleteAllStudents() {
        studentRepository.deleteAll();
        return "All Students deleted";
    }
    
}