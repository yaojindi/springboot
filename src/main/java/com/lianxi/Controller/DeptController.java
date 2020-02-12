package com.lianxi.Controller;

import com.lianxi.Model.Dept;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lianxi.Service.IdeptService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

@RequestMapping("/Dept")
public class DeptController {

    @Autowired
    private IdeptService ids;

    @RequestMapping("/insert")
    @ResponseBody
    public String isnert(Dept dd){
        try {
            ids.insert(dd);
            return "录入成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
            return "录入失败";
    }
    @RequestMapping("/selectlist")
    @ResponseBody
    public List selectlsit(){

        try {
            List ll = ids.selectlsit();
            return ll ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/selectone")
    @ResponseBody
    public Dept selectone(Integer did){
        Dept dd = null;
        try {
            dd = ids.selectone(did);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dd;
    }
    @RequestMapping("/deleteone")
    @ResponseBody
    public String deleteone(Integer did){
        try {
            ids.deleteone(did);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
        }
            return "no";
    }
    @RequestMapping("/updateone")
    @ResponseBody
    public String updateone(Dept dd){
        try {
            ids.updateone(dd);
            return "已修改";
        } catch (Exception e) {
            e.printStackTrace();
        }
            return "未修改";
    }

}
