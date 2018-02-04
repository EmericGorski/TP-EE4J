package yncrea.pw03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by Emeric on 29/01/2018.
 */
@Configuration
@ComponentScan (basePackages = "yncrea.pw03.service")
public class AppConfig {

    @Bean
    public Properties dbProperties(){
        Properties dbProperties = new Properties();
        dbProperties.setProperty("driverClass", "com.mysql.jdbc.Driver");
        dbProperties.setProperty("jdbcUrl", "jdbc:mysql://localhost:3306/yncrea_pw03");
        dbProperties.setProperty("username", "root");
        dbProperties.setProperty("password", "");

        return dbProperties;
    }
}
