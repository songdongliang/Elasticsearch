package com.sdl.elasticsearch.controller;

import com.sdl.elasticsearch.entity.Post;
import com.sdl.elasticsearch.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Song Dongliang
 * @description:
 * @date 2018-07-31 13:49
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private PostRepository postRepository ;

    @GetMapping("test")
    public String test() {
        return "hello world";
    }

    @GetMapping("index")
    public boolean index() {
        return elasticsearchTemplate.createIndex(Post.class);
    }

    @GetMapping("save/post")
    public Post testPost() {
        Post post = new Post();
        post.setContent("enjoy your time");
        post.setCreateTime(new Date());
        post.setHeat(1000);
        post.setUserId(1L);
        post.setId(1L);
        return postRepository.save(post);
    }

}
