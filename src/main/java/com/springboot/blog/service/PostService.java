package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;

import java.util.List;

/**
 * @author Chhin_Hua - 17/03
 **/

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(Long id);

    PostDto updatePostById(PostDto postDto, Long id);

    void deletePostById(Long id);
}
