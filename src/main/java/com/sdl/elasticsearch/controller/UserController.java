package com.sdl.elasticsearch.controller;

import com.sdl.elasticsearch.entity.User;
import com.sdl.elasticsearch.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Song Dongliang
 * @description:
 * @date 2018-07-30 14:57
 */
@RestController
@RequestMapping("info/user/")
public class UserController {

    @Resource
    private UserService userService ;

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/test")
    public User test() {
        User user = new User();
        user.setId(1L);
        user.setCityId(440304);
        user.setProvinceId(440000);
        user.setNickname("渣渣灰");
        user.setUsername("songdongliang");
        user.setMobile("15737130245");
        return userService.save(user);
    }

}
