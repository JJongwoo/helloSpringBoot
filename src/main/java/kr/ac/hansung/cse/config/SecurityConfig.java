package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//설정의 세가지 방법  xml, annotation, java class
@Configuration //설정에 관한 클래스
@EnableWebSecurity //이용 가능
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http        
        	.authorizeRequests()
        		.anyRequest()
        		.permitAll()
        		.and()
            .csrf().disable();
    }
}
