package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.entities.Post;
import com.profile.repository.PostRepository;

@Service
public class PostServiceImplementation implements PostService{

	@Autowired
	PostRepository repo;
	
	@Override
	public void createPost(Post post) {
		repo.save(post);
	}

}
