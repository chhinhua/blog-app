package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Chhin_Hua - 21/03
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "LoginDTO Model Information")
public class LoginDto {

    @Schema(description = "Blog Login Username of Email")
    @NotEmpty(message = "Username should not be empty.")
    private String usernameOrEmail;

    @Schema(description = "Blog Login Password")
    @NotEmpty(message = "Password should not be empty.")
    private String password;

}
