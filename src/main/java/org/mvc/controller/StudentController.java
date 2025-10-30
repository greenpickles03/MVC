package org.mvc.controller;

import org.mvc.model.Student;
import org.mvc.view.StudentView;

public class StudentController {

    private Student mode;
    private StudentView studentView;

    public StudentController(Student mode, StudentView studentView){
        this.mode = mode;
        this.studentView = studentView;
    }

    public void setStudentName(String name){
        mode.setName(name);
    }

    public String getStudentName(){
        return mode.getName();
    }

    public void setStudentRollNo(String rollNo){
        mode.setRollNo(rollNo);
    }

    public String setStudentRollNo(){
        return mode.getRollNo();
    }

    public void updateView(){
        studentView.printStudentDetails(mode.getName(), mode.getRollNo());
    }
}
