package com.example.student.VO;

import com.example.student.Entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Student student;
    private Elective elective;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setElective(Elective elective) {
        this.elective = elective;
    }

    public Student getStudent() {
        return this.student;
    }

    public Elective getElective() {
        return this.elective;
    }
}