package com.springboot.blog.controller;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Chhin_Hua - 19/03
 **/

@RestController
@RequestMapping("/api/")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(name = "postId") long postId,
                                                    @RequestBody CommentDto commentDto) {
        CommentDto commentDtoResponse = commentService.createComment(postId, commentDto);

        return new ResponseEntity<>(commentDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping("/posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getAllComment(@PathVariable(name = "postId") long postId) {

        List<CommentDto> comments = commentService.getCommentsByPostId(postId);

        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @GetMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> getById(@PathVariable(value = "postId") long postId,
                                              @PathVariable(value = "commentId") long commentId) {
        CommentDto commentDtoResponse = commentService.getCommentById(postId, commentId);

        return new ResponseEntity<>(commentDtoResponse, HttpStatus.OK);
    }

    @PutMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> updateCommentById(@PathVariable(value = "postId") long postId,
                                                        @PathVariable(value = "commentId") long commentId,
                                                        @RequestBody CommentDto commentDto) {
        CommentDto commentDtoResponse = commentService.updateCommentById(postId, commentId, commentDto);

        return new ResponseEntity<>(commentDtoResponse, HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable(value = "postId") long postId,
                                                @PathVariable(value = "commentId") long commentId) {

        commentService.deleteComment(postId, commentId);

        return new ResponseEntity<>("Comment deleted successfully.", HttpStatus.OK);
    }

}
