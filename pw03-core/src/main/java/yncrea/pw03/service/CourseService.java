package yncrea.pw03.service;

import yncrea.pw03.entity.Course;

import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
public interface CourseService {
    public List<Course> findByLastname(String name);
    public void saveCourse(Course course);
    public List<Course> findAll();
}
