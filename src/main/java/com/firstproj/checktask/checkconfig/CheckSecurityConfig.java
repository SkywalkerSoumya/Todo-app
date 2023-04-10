//package com.firstproj.checktask.checkconfig;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//
//
//public class CheckSecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity htttp) throws Exception{
//		//super.configure(http);
//		http
//			.authorizeRequest()
//			.anyRequest()
//			.authenticate()
//			.and()
//			.httpBasic();
//	}
//}
