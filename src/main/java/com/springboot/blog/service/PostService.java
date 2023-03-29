package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(final PostDto postDto);

    PostResponse getAllPosts(final int pageNo, final int pageSize, final String sortBy, final String sortDir);

    PostDto getPostById(final long id);

    PostDto updatePostById(final PostDto postDto, long id);

    void deletePostById(final long id);

    List<PostDto> getPostsByCategoryId(final Long categoryId);

}
