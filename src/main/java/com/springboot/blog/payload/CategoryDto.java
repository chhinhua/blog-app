package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Chhin_Hua - 29/03
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "CategoryDTO Model Information ")
public class CategoryDto {
    private Long id;

    @Schema(description = "Category Name")
    @Size(min = 2, message = "Category name should have at least 2 characters")
    private String name;

    @Schema(description = "Category Description")
    private String description;

}
