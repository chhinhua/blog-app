package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * @author Chhin_Hua - 19/03
 **/

@Data
@Schema(description = "CommentDTO Model Information ")
public class CommentDto {
    private Long id;

    @Schema(description = "Comment Name")
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @Schema(description = "Comment Email")
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @Schema(description = "Comment Content")
    @NotEmpty
    @Size(min = 10, message = "Comment body must be minimum 10 characters")
    private String body;

}
