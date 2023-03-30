package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Chhin_Hua - 18/03
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Post Response Information")
public class PostResponse {

    @Schema(description = "Blog Post Response Content")
    private List<PostDto> content;

    @Schema(description = "Blog Post Response Current Page Number")
    private int pageNo;

    @Schema(description = "Blog Post Response Page Size")
    private int pageSize;

    @Schema(description = "Blog Post Response Total Element")
    private long totalElements;

    @Schema(description = "Blog Post Response Total Pages")
    private int totalPages;

    @Schema(description = "Blog Post Response is it the last page?")
    private boolean last;

}
