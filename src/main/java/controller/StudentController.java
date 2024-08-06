package controller;

import entity.Student;
import model.StudentModel;
import persistence.IModel.IStudent;

import java.util.ArrayList;

public class StudentController {
    IStudent iStudent = new StudentModel();

    public void create(Student student){
        this.iStudent.create(student);
    }

    public void read(){
        ArrayList<Student> studentArrayList = iStudent.read();
        studentArrayList.forEach(System.out::println);
    }
    public void update(Student student){
        iStudent.update(student);
    }

    public void read(Student student){
        iStudent.read(student);
    }

    public void readMail(Student student){
        iStudent.read(student);
    }

}
