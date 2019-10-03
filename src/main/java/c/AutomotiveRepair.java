package c;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class AutomotiveRepair {

    public static void main( String[] args ) {

        SpringApplication.run(AutomotiveRepair.class, args);

    }

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();

    }

}
