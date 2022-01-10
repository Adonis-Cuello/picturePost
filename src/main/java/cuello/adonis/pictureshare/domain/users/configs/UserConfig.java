package cuello.adonis.pictureshare.domain.users.configs;

import cuello.adonis.pictureshare.domain.users.models.User;
import cuello.adonis.pictureshare.domain.users.repos.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner (UserRepo userRepo){
        return args -> {
            User user = new User("myemail@gmail.com");
            userRepo.save(user);
        };
    }
}
