package com.nhnent.service;

import com.nhnent.domain.Post;
import com.nhnent.persistence.PostMapper;
import com.nhnent.util.DatetimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> getAllPosts() {
        List<Post> posts = postMapper.getAllPosts();
        for (Post post : posts)
            post.setBeautifulDate(DatetimeUtil.beautify(post.getRegisteredDate().toString()));
        return posts;
    }

    public String summarize(Post post, int length) {
        String content = post.getContent();
        if (content.length() <= length)
            return content;
        return post.getContent().substring(0, length-3) + "...";
    }
}
