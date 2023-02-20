package kpfu.aisalin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import javax.sql.DataSource;

@Configuration
public class AuthenticationProviderConfig {

    private final DataSource dataSource;

    @Autowired
    public AuthenticationProviderConfig(@Qualifier("dataSource") DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean(name = "userDetailsService")
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(dataSource);
        jdbcImpl.setUsersByUsernameQuery("select login as username, password, true as enabled from \"users\" where login=?");
        jdbcImpl.setAuthoritiesByUsernameQuery("select login as username, role as users from \"users\" where login=?");
        //
        return jdbcImpl;
    }


}
