package com.nhnent.persistence;

import com.nhnent.domain.Post;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostMapper {

    @Select("SELECT * FROM Post ORDER BY registered_date DESC, post_id DESC")
    @Results(value = {
            @Result(column="post_id", property="id"),
            @Result(column="author_email", property="email"),
            @Result(column="author_password", property="password"),
            @Result(column="content", property="content"),
            @Result(column="registered_date", property="registeredDate"),
            @Result(column="modified_date", property="modifiedDate")
    })
    public List<Post> getAllPosts();
}
