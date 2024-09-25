package com.wdtjm.usercenter.mapper;
import com.wdtjm.usercenter.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;


/**
 * ClassName:UserMapperTest
 * Package:com.wdtjm.usercenter.mapper
 * Description:
 *
 * @Author张博文
 * @Create2024/9/2414:02
 * @Version1.0
 */
@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();
        user.setName("zbw");
        user.setAvatar("https://www.baidu.com");
        user.setAccount("123");
        user.setPassword("456");
        user.setStatus(0);
        user.setIsDelete(0);
        userMapper.insert(user);
    }
}