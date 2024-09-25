package com.wdtjm.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wdtjm.usercenter.model.entity.User;
import com.wdtjm.usercenter.service.UserService;
import com.wdtjm.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 18260
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-09-24 13:58:01
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}



