package com.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
