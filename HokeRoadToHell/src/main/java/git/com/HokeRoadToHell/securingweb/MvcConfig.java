package git.com.HokeRoadToHell.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/person").setViewName("person");
        registry.addViewController("/person_all").setViewName("person_all");
        registry.addViewController("/addperson").setViewName("addperson");
        registry.addViewController("/pet").setViewName("pet");
        registry.addViewController("/pet_all").setViewName("pet_all");
        registry.addViewController("/style.css").setViewName("style.css");
    }

}