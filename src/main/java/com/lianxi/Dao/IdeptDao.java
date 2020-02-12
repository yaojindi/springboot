package com.lianxi.Dao;

import com.lianxi.Model.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface  IdeptDao {
    @Insert("insert into dept values(#{did},#{dname},#{dsex})")
    void  insert(Dept dd);

    List selectlsit();

    Dept selectone(Integer did);

    void deleteone(Integer did);

    void updateone(Dept dd);

}
