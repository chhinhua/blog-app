package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(final long postId, final CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(final long postId);

    CommentDto getCommentById(final long postId, final long commentId);

    CommentDto updateCommentById(final long postId, final long commentId, final CommentDto commentDto);

    void deleteComment(final long postId, final long commentId);


}
