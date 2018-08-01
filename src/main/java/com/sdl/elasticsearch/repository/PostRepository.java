package com.sdl.elasticsearch.repository;

import com.sdl.elasticsearch.entity.Post;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostRepository extends ElasticsearchRepository<Post,Long> {
}
