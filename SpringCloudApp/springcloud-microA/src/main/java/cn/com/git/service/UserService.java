package cn.com.git.service;

import cn.com.git.bean.TestBatchUser;
import cn.com.git.mapper.TestBatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private TestBatchMapper testBatchMapper;

    public int insertUser(TestBatchUser user) {
        return testBatchMapper.insertUser(user);
    }

}
