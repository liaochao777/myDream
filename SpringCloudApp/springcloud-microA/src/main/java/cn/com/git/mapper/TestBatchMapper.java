package cn.com.git.mapper;

import cn.com.git.bean.TestBatchUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2018/8/7.
 */
@Mapper
public interface TestBatchMapper {
    int insertUser(TestBatchUser user);
}
