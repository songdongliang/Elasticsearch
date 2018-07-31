package com.sdl.elasticsearch.service;

import com.sdl.elasticsearch.entity.User;
import com.sdl.elasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Song Dongliang
 * @description:
 * @date 2018-07-30 15:18
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * 插入用户
     * @param user
     */
    public User save(User user) {
        return repository.save(user);
    }

    /**
     * 删除用户文档
     * @param id 用户id
     * @return
     */
    public void delete(Long id) {
        repository.deleteById(id);
    }



}
