package app.config;

import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Timer;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
//    @Bean(name = "dog")
//    public Dog getDog(){
//        return new Dog();
//    }
//    @Bean(name = "timer")
//    public Timer getTimer() {
//        return new Timer();
//    }
}
