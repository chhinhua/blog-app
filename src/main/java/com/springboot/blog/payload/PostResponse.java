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

    @Schema(description = "Post Content")
    private List<PostDto> content;

    @Schema(description = "Page Number")
    private int pageNo;

    @Schema(description = "Page Size")
    private int pageSize;

    @Schema(description = "Total Posts")
    private long totalElements;

    @Schema(description = "Total Pages")
    private int totalPages;

    @Schema(description = "Is it the last page?")
    private boolean last;

}