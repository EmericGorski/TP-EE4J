package yncrea.pw03.service.impl;

import org.springframework.transaction.annotation.Transactional;
import yncrea.pw03.dao.WorkDAO;
import yncrea.pw03.entity.Work;
import yncrea.pw03.service.WorkService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Emeric on 29/01/2018.
 */
@Named
@Transactional
public class WorkServiceImpl implements WorkService {

    @Inject
    private WorkDAO workDAO;

    @Override
    public List<Work> findByLastname(String name) {
        return this.workDAO.findByLastname(name);
    }

    @Override
    public void saveWork(Work work) {
        this.workDAO.save(work);
    }

    @Override
    public List<Work> findAll() {
        return this.workDAO.findAll();
    }
}
