package yncrea.pw03.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.pw03.entity.Work;

import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
public interface WorkDAO extends JpaRepository<Work, Long> {
    public List<Work> findByLastname(String name);
}
