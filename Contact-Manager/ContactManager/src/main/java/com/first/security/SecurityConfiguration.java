//package com.first.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.function.Function;
//
//
//public class SecurityConfiguration {
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(){
//    	UserDetails userDetails1 = createNewUser("saurabh","sarwesh");
//    	UserDetails userDetails2 = createNewUser("meera","meera");
//        return new InMemoryUserDetailsManager(userDetails1,userDetails2);
//    }
//
//	private UserDetails createNewUser(String username,String password) {
//		Function<String,String> passwordEncoder =
//                input -> passwordEncoder().encode(input);
//        UserDetails userDetails = User.builder().
//                passwordEncoder(passwordEncoder)
//                .username(username)
//                .password(password)
//                .roles("USER","ADMIN")
//                .build();
//		return userDetails;
//	}
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
//
//
//
