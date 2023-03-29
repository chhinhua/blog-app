package com.springboot.blog.service;

import com.springboot.blog.payload.LoginDto;
import com.springboot.blog.payload.RegisterDto;

public interface AuthService {

    String login(final LoginDto loginDto);

    String register(final RegisterDto registerDto);

}
