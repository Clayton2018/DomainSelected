package c.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    private static final String MECHANIC_ROLE = "Mechanic";
    public static final  String USER_ROLE = "Senior Mechanic";

    //@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth.inMemoryAuthentication()
                .withUser("mechanic")
                .password(encoder().encode("mechanic"))
                .roles(MECHANIC_ROLE)
                .and()
                .withUser("user")
                .password(encoder().encode("user"))
                .roles(USER_ROLE);

    }

    //@Override
    protected void configure(HttpSecurity http) throws Exception{

        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/technician/getAll")
                .hasRole(MECHANIC_ROLE)
                .and()
                .csrf().disable();


    }

    @Bean
    public PasswordEncoder encoder(){

        return new BCryptPasswordEncoder();

    }

}
