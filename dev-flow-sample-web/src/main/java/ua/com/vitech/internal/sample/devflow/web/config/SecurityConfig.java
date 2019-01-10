package ua.com.vitech.internal.sample.devflow.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private boolean requireSsl;

    @Value("${security.require-ssl:false}")
    public void setRequireSsl(boolean requireSsl) {
        this.requireSsl = requireSsl;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        if (requireSsl) {
            http.requiresChannel().anyRequest().requiresSecure();
        }
        http.authorizeRequests()
            .antMatchers("/public/**", "/login/**", "/login*", "/favicon.ico").permitAll()
            .anyRequest().authenticated()
            .and()
            .oauth2Login().loginPage("/login");
    }
}
