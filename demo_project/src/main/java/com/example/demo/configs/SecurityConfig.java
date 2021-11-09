package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Autowired
    public DataSource dataSource;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**")
                .authenticated()
                .antMatchers("/get/**")
                .hasRole("ADMIN")
                .and()
                .formLogin()
                .and()
                .logout()
                .logoutSuccessUrl("/");
    }
    private PasswordEncoder delegateEncoder =
            PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception{
        clients
                .jdbc(dataSource)
                .passwordEncoder(delegateEncoder);
    }
    @Bean
    JdbcUserDetailsManager jdbcUserDetailsManager(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pass=encoder.encode("admin");
        UserDetails user=User.builder()
                .username("admin")
                .password(delegateEncoder.encode("123123"))
                .roles("ADMIN")
                .build();
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        if (jdbcUserDetailsManager.userExists(user.getUsername()))
        {
            jdbcUserDetailsManager.deleteUser(user.getUsername());
        }

        jdbcUserDetailsManager.createUser(user);

        System.out.println(user.getPassword());
        return jdbcUserDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder(12);
    }
}
