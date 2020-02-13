package com.lianxi.Service;

import com.lianxi.Dao.IdeptDao;
import com.lianxi.Model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class IdeptServiceImpl implements IdeptService {
    @Autowired
    private IdeptDao idao;

    @Override
    public void insert(Dept dd) {

        idao.insert(dd);
    }

    @Override
    public List selectlsit() {
        return idao.selectlsit();

    }

    @Override
    public Dept selectone(Integer did) {
        return idao.selectone(did);
    }

    @Override
    public void deleteone(Integer did) {
        idao.deleteone(did);
    }

    @Override
    public void updateone(Dept dd) {
        idao.updateone(dd);
    }


}
