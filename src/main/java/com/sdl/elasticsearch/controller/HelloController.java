package com.sdl.elasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Song Dongliang
 * @description:
 * @date 2018-07-31 13:49
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}
