package com.nhnent.controller;

import com.nhnent.domain.Post;
import com.nhnent.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {
    @Autowired
    private PostService postService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String hello(Model model) {
        List<Post> posts = postService.getAllPosts();
        List<String> recentSummaries = posts.stream()
                .map(post -> postService.summarize(post, 26))
                .collect(Collectors.toCollection(LinkedList::new));

        model.addAttribute("posts", posts);
        model.addAttribute("recentSummaries", recentSummaries);
        return "index";
    }
}
