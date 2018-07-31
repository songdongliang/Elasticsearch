package com.sdl.elasticsearch.repository;

import com.sdl.elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User,Long> {
}
