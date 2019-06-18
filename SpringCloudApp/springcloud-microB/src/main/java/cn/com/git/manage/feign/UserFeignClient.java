package cn.com.git.manage.feign;

import cn.com.git.bean.TestBatchUser;
import cn.com.git.message.ResponseMsg;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "springcloud-microA") // 申明这是一个Feign客户端，并且指明服务id
public interface UserFeignClient {
	
	@RequestMapping(value = "/user/insertUser", method = RequestMethod.POST)
	ResponseMsg insertUser(@RequestBody TestBatchUser user);

}
