package yncrea.pw03.service;

import yncrea.pw03.entity.Work;

import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
public interface WorkService {
    public List<Work> findByLastname(String name);
    public void saveWork(Work work);
    public List<Work> findAll();
}
