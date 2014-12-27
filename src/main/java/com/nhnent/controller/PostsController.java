package com.nhnent.controller;

import com.nhnent.domain.Post;
import com.nhnent.domain.UploadPost;
import com.nhnent.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostService postService;

    @RequestMapping(value="/upload", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String upload(@Valid UploadPost uploadPost, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return bindingResult.getModel().toString();
        Post post = uploadPost.toPost();
        post.setRegisteredDate(new Date());
        postService.insertPost(post);
        return post.getBeautifulDate();
    }
}
