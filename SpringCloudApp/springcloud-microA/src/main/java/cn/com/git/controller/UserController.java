package cn.com.git.controller;

import cn.com.git.bean.ResDataInsertUser;
import cn.com.git.bean.TestBatchUser;
import cn.com.git.message.ResponseMsg;
import cn.com.git.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/insertUser")
    public ResponseMsg insertUser(@RequestBody TestBatchUser user) {

        ResponseMsg res=new ResponseMsg();
        ResDataInsertUser data=new ResDataInsertUser();
        data.setSum(userService.insertUser(user));
        res.setData(data);
        return res;
    }

}
