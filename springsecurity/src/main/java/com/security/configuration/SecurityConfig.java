//package com.security.configuration;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import lombok.RequiredArgsConstructor;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	@Bean
//	public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
//		 http
//         .authorizeHttpRequests((authz) -> authz
//        		 .anyRequest()
//        		 .authenticated()
//         ).formLogin();
//     return http.build();
//	}
//	
//	 @Bean
//	    public UserDetailsManager users(DataSource dataSource) {
//	        UserDetails user = User.withDefaultPasswordEncoder()
//	            .username("user")
//	            .password("password")
//	            .roles("USER")
//	            .build();
//	        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//	        users.createUser(user);
//	        return users;
//	    }
//	 
//	 @Bean
//	    public InMemoryUserDetailsManager userDetailsService() {
//	        UserDetails user = User.builder()
//	            .username("user")
//	            .password(PasswordEncoder().encode("pass"))
//	            .roles("USER")
//	            .build();
//	        return new InMemoryUserDetailsManager(user);
//	    }
//	 
//	 @Bean
//	 public PasswordEncoder PasswordEncoder() {
//		return new BCryptPasswordEncoder();
//		 
//	 }
//}
