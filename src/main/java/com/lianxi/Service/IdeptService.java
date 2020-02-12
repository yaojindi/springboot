package com.lianxi.Service;

import com.lianxi.Model.Dept;


import java.util.List;

public interface IdeptService {

    void  insert(Dept dd);
    List selectlsit();
    Dept selectone(Integer did);
    void deleteone(Integer did);
    void updateone(Dept dd);
}
