package com.example.springSecurity.configure;



import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.*;
import org.springframework.security.web.*;

@Configuration
public class Appconfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                               .username("navin")
                               .password("1234")
                               .roles("USER")
                               .build();
        return new InMemoryUserDetailsManager(user);
    }
}
