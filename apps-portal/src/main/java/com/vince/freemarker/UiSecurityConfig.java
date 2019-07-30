package com.vince.freemarker;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableOAuth2Sso
@Configuration
public class UiSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/login**", "/bootstrap-4.3.1/**", "/css/**", "/js/**").permitAll()
        .anyRequest()
        .authenticated();
    }

}
