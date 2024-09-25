package com.wdtjm.usercenter.controller;

import com.wdtjm.usercenter.model.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UserController
 * Package:com.wdtjm.usercenter.controller
 * Description:
 *
 * @Author张博文
 * @Create2024/9/2510:21
 * @Version1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/register")
    public Result register() {
        return Result.success();
    }

    @GetMapping("/login")
    public Result login() {
        return Result.success();
    }
}
