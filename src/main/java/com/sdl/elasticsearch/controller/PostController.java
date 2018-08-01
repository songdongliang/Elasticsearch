package com.sdl.elasticsearch.controller;

import com.sdl.elasticsearch.entity.Post;
import com.sdl.elasticsearch.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Song Dongliang
 * @description:
 * @date 2018-08-01 16:13
 */
@RestController
@RequestMapping("moment/post")
public class PostController {

    @Autowired
    private PostService postService ;

    @PutMapping
    public Post save(@RequestBody Post post) {
        return postService.save(post);
    }

}
