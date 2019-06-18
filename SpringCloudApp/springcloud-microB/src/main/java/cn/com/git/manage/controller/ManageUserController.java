package cn.com.git.manage.controller;

import cn.com.git.bean.TestBatchUser;
import cn.com.git.message.ResponseMsg;
import cn.com.git.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ManageUserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/addUser")
	public ResponseMsg addUser(@RequestBody TestBatchUser user) {
		return this.userService.insertUser(user);
	}

}
