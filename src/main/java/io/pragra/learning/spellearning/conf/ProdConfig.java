package io.pragra.learning.spellearning.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Profile("prod")
//@Configuration
public class ProdConfig {

    @Bean(name = "pages")
    public String page(){
        return "prod";
    }
}
