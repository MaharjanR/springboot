package io.pragra.learning.spellearning;

import io.pragra.learning.spellearning.conf.DevConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class SpelLearningApplication {

    public static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(SpelLearningApplication.class, args);
//        System.out.println(context.getBean(Mood.class).getMood());
    }

    @GetMapping("/")
        public String getHomePage(){
//        return "index";
        return context.getBean("page", String.class);
    }
}
