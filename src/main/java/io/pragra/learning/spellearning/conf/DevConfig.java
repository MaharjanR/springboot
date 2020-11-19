package io.pragra.learning.spellearning.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Profile("dev")
@Configuration
public class DevConfig {

    @Value("#{mood.getMood() > 5 ? 'prod' : 'index'}")
    private String moodVal;

    @Bean(name="page")
    public String page(){
        System.out.println(moodVal);
        return "prod";
    }
}
