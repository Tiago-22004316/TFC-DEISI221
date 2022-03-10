package pt.ulusofona.tfc.trabalho

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

import org.springframework.security.crypto.password.PasswordEncoder





@Configuration
@EnableWebSecurity
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        http
            .authorizeRequests()
            //.antMatchers("/users/list").hasRole("USER")  << uncomment this to protect this endpoint
//            .antMatchers("/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin();
    }

    override fun configure(web: WebSecurity) {
        web.ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/img/**")
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
            .withUser("u1").password(passwordEncoder().encode("p1")).roles("USER")
            .and()
            .withUser("u2").password(passwordEncoder().encode("p2")).roles("USER")
            .and()
            .withUser("admin").password(passwordEncoder().encode("adminPass123")).roles("ADMIN")
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }



}