package yncrea.pw03.service;

import yncrea.pw03.entity.Student;

import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
public interface StudentService {
    public List<Student> findByLastname(String name);
    public void saveStudent(Student student);
    public List<Student> findAll();

}
