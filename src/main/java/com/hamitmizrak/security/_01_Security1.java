package com.hamitmizrak.security;

import com.hamitmizrak.bean.PasswordBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class _01_Security1 extends WebSecurityConfigurerAdapter {

    @Autowired
    PasswordBean passwordBean;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http
               .authorizeRequests()
               .antMatchers("/","/index","/login","/public")
               .permitAll()
               .anyRequest()
               .authenticated();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception{
        PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
        authentication
                .inMemoryAuthentication()
                .withUser("root")
                .password( passwordBean.passwordEncoder()
                  .encode("root")).roles("USER");

    }



/*  @Autowired
    PasswordBean passwordBean;*/

  /*  //kendi username ve password ve rol belirdik maskelenmiş gelen veri
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception{
        PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
        //root  ==> ASdasd1a65sd1as5dugh&/klas908098989()^+
        authentication.inMemoryAuthentication().withUser("root").password( passwordBean.passwordEncoder().encode("root")).roles("USER");

    }*/



    //kendi username ve password ve rol belirdik maskelenmiş gelen veri
   /* @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception{
        PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
        //root  ==> ASdasd1a65sd1as5dugh&/klas908098989()^+
        authentication.inMemoryAuthentication().withUser("root").password(passwordEncoder.encode("root")).roles("USER");

    }
*/


    //kendi username ve password ve rol belirdik maskelenmeden gelen veri
/*    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception{
        authentication.inMemoryAuthentication().withUser("root").password("{noop}root").roles("USER");

    }*/



/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }*/
}
