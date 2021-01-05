package com.example.springauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    for in-memory user store
//    One place where user information can be kept is in memory. Suppose you have only a
//    handful of users, none of which are likely to change. In that case, it may be simple
//    enough to define those users as part of the security configuration.
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("oleh")
                .password("{noop}oleh-user-password")
                .authorities("ROLE_USER")

                .and()

                .withUser("oleh-2")
                .password("{noop}oleh-user-password")
                .authorities("ROLE_USER");
    }
}
