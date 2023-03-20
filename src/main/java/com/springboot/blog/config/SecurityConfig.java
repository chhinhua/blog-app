package com.springboot.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Chhin_Hua - 20/03
 **/

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//      authorize.anyRequest().authenticated())
        httpSecurity
                .csrf()
                .disable()
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers(HttpMethod.GET, "/api/**")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
                )
                .httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }

    /*@Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder().username("user").password(passwordEncoder().encode("user")).roles("USER").build();

        UserDetails admin = User.builder().username("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user, admin);
    }*/

}
