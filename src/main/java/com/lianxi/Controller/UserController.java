package com.lianxi.Controller;

import com.lianxi.Model.User;
import com.lianxi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping("/userzhang")
    @ResponseBody
    public User selectone(String zhang){
        try {
           return  us.selectone(zhang);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }


}
