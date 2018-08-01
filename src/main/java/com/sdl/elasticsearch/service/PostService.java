package com.sdl.elasticsearch.service;

import com.sdl.elasticsearch.entity.Post;
import com.sdl.elasticsearch.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Song Dongliang
 * @description:
 * @date 2018-08-01 14:05
 */
@Service
public class PostService {

    @Autowired
    private PostRepository postRepository ;

    /**
     * 插入一个post
     * @param post
     * @return
     */
    public Post save(Post post) {
        return postRepository.save(post);
    }

    /**
     * 根据id查询一个post
     * @param id
     * @return
     */
    public Post getById(Long id) {
        return postRepository.findById(id).orElse(new Post());
    }

    /**
     * 根据id删除一个post
     * @param id
     */
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }

}
