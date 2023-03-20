package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

/**
 * @author Chhin_Hua - 20/03
 **/

@Getter
@AllArgsConstructor
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

}
