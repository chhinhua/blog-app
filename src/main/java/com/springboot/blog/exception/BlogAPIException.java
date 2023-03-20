package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;

/**
 * @author Chhin_Hua - 19/03
 **/

public class BlogAPIException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final String message;

    public BlogAPIException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public BlogAPIException(String message, HttpStatus httpStatus, String message1) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message1;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
