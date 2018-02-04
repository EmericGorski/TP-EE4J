package yncrea.pw03.service.impl;

import org.springframework.transaction.annotation.Transactional;
import yncrea.pw03.dao.CourseDAO;
import yncrea.pw03.entity.Course;
import yncrea.pw03.service.CourseService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
@Named
@Transactional
public class CourseServiceImpl implements CourseService{

    @Inject
    private CourseDAO courseDAO;

    @Override
    public List<Course> findByLastname(String name) {
        return this.courseDAO.findByLastname(name);
    }

    @Override
    public void saveCourse(Course course) {
        this.courseDAO.save(course);
    }

    @Override
    public List<Course> findAll() {
        return this.courseDAO.findAll();
    }
}
