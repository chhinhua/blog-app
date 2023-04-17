package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

/**
 * @author Chhin_Hua - 17/03
 **/

@Data
@Schema(description = "PostDTO Model Information")
public class PostDto {
    private Long id;

    @Schema(description = "Post Title")
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    @Schema(description = "Post Description")
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    @Schema(description = "Post Content")
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(description = "Post Category")
    private Long categoryId;

}
