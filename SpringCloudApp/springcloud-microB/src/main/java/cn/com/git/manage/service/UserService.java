package cn.com.git.manage.service;

import cn.com.git.bean.TestBatchUser;
import cn.com.git.message.ResponseMsg;
import cn.com.git.manage.feign.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    @HystrixCommand(fallbackMethod = "insertUserFallbackMethod") // 进行容错处理
    public ResponseMsg insertUser(TestBatchUser user) {
        return this.userFeignClient.insertUser(user);
    }

    public ResponseMsg insertUserFallbackMethod(TestBatchUser user) { // 请求失败执行的方法
        return new ResponseMsg();
    }

}
