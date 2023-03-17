package com.springboot.blog.payload;

import lombok.Data;

/**
 * @author Chhin_Hua - 17/03
 **/

@Data
public class PostDto {

    private Long id;
    private String title;
    private String description;
    private String content;

}
