package c;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class AutomotiveRepair {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


    public static void main( String[] args ) {

        SpringApplication.run(AutomotiveRepair.class, args);

    }

    @Bean
    public RestTemplate resttemplate(){

        return new RestTemplate();

    }
}
