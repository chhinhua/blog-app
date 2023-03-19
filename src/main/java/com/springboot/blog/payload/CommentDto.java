package com.springboot.blog.payload;

import lombok.Data;

/**
 * @author Chhin_Hua - 19/03
 **/

@Data
public class CommentDto {

    private Long id;
    private String name;
    private String email;
    private String body;

}
