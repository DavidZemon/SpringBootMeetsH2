package name.zemon.david.filebaseddbtrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class SpringBootMeetsH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMeetsH2Application.class, args);
    }
}
