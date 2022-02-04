package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
