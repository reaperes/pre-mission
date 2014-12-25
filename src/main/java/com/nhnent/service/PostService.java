package com.nhnent.service;

import com.nhnent.domain.Post;
import com.nhnent.persistence.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }
}
