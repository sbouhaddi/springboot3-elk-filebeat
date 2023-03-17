package dev.sabri.springbootapploggingjson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SpringbootAppLoggingJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppLoggingJsonApplication.class, args);
    }

}

@RestController
record WelComeController() {

    static Logger log = LoggerFactory.getLogger(WelComeController.class);

    @GetMapping("/hello")
    public String helloMessage() {

        log.info("""
                Hello !
                Logging in Json Format From My Controller !
                Cool 🥳
                """.stripIndent());

        return """
                                
                Just A Message
                To Say Hi !
                       
                """.stripIndent();
    }
}
