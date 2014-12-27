package com.nhnent.service;

import com.nhnent.Application;
import com.nhnent.domain.Post;
import com.nhnent.util.DatetimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@IntegrationTest({"server.port=0", "management.port=0"})
public class PostServiceTests {

    @Autowired
    PostService postService;

    @Test
    public void testBeautify() {
        String content = "123456789012345678901234567890";
        int summarizeLength = 10;

        Post post = new Post();
        post.setContent(content);

        String result = postService.summarize(post, summarizeLength);
        Assert.isTrue(result.length() == summarizeLength);
    }
}
