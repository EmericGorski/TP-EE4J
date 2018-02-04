package yncrea.pw03.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.pw03.entity.Student;

import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
public interface StudentDAO extends JpaRepository<Student, Long>{
    public List<Student> findByLastname(String name);
}
